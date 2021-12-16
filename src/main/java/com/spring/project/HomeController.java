package com.spring.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.spring.project.Dao.dataDAO;
import com.spring.project.Dto.AlramDTO;
import com.spring.project.Dto.CardDTO;
import com.spring.project.Dto.CouponHasUserDTO;
import com.spring.project.Dto.HasAlram;
import com.spring.project.Dto.StatiumDTO;
import com.spring.project.Dto.UserDTO;
import com.spring.project.Dto.VideoAndStadium;
import com.spring.project.Dto.VideoDTO;
import com.spring.project.Dto.dataDTO;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private dataDAO datadao;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
	public String home(Locale locale, Model model, HttpServletRequest request, dataDTO data) {

		/*
		 * dataDTO temp = new dataDTO(); temp.setTemperature(19.12);
		 * temp.setCoAD(18.12); temp.setCodensity(17.12);
		 */

		return "home";
	}
	
	
	// 인증번호 생성 메소드
		public static String numberGen(int len, int dupCd) {
			// 앱스토어 검수용

			Random rand = new Random();
			String numStr = ""; // 난수가 저장될 변수

			for (int i = 0; i < len; i++) {

				// 0~9 까지 난수 생성
				String ran = Integer.toString(rand.nextInt(10));

				if (dupCd == 1) {
					// 중복 허용시 numStr에 append
					numStr += ran;
				} else if (dupCd == 2) {
					// 중복을 허용하지 않을시 중복된 값이 있는지 검사한다
					if (!numStr.contains(ran)) {
						// 중복된 값이 없으면 numStr에 append
						numStr += ran;
					} else {
						// 생성된 난수가 중복되면 루틴을 다시 실행한다
						i -= 1;
					}
				}
			}
			return numStr;
		}
		// 사용자 인증
		// SMS ID 와 API Key로 토큰을 발행해 사용자를 인증
		// https://message.gabia.com/api/documentation/
		@RequestMapping(value = "/gabia_token", method = { RequestMethod.POST, RequestMethod.GET })
		@ResponseBody
		public String gabia_token(HttpServletRequest request, Model model) {
			String encode;
			String result = null;
			String access_token = null;
			// 1. Http 통신을 위한 OkHttp 객체 생성 (보통 안드로이드에서 많이 사용. 가비아 서버와 비교 했을 때 해당 서버가 클라이언트가 되니까 걍 여따 한듯.)
			OkHttpClient client = new OkHttpClient();

			MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded"); // jQuery의 ajax 요청시 default 포 ( 가비아에서 json형식이 아닌 해당 형식을 요구하는 듯) : https://blog.naver.com/PostView.nhn?blogId=writer0713&logNo=221853596497&redirect=Dlog&widgetTypeCall=true&directAccess=false
			// 2. RequsetBody 생성
			RequestBody bodyd = RequestBody.create(mediaType, "grant_type=client_credentials"); // okhttp3.RequestBody : REST API, HTTP 통신 전용 자바 라이브러리, Retrofit의 기본..?
			// 3. POST 객체 생성
			Request request1 = new Request.Builder()
					.url("https://sms.gabia.com/oauth/token")
					.post(bodyd) // 인자로 넣기
					.addHeader("Content-Type", "application/x-www-form-urlencoded")
					.addHeader("Authorization", "Basic cGxheWNhcm5pdmFsOjgwZGQ5ZmFiYzQyNGU1MGRhM2QxMGY0MzRjY2E3OWIx")
					.addHeader("cache-control", "no-cache")
					.build();

			try {
				// 4. 요청 전송
				Response response1 = client.newCall(request1).execute(); // 비동기 처리할 시 enqueue() 메소드로 변 -> 콜백함수 등록해야됨.
				System.out.println("response?: " + response1);
				result = response1.body().string();
				System.out.println(result);
				// JSON 으로 parsing 과정
				JSONParser parser = new JSONParser();
				Object obj = parser.parse(result);
				JSONObject jsonObj = (JSONObject) obj;
				access_token = (String) jsonObj.get("access_token"); // access_token 추출
				String message = (String) jsonObj.get("message"); // message 추출
				System.out.println("access토큰 : " + access_token);
				
				System.out.println("message : " + message);


				// base64로 변환
				encode = "playcarnival:" + access_token;
				// 인코딩 부분 회사명 바꿔주기 해야함;
				byte[] targetBytes = encode.getBytes();
				//org.apache.commons.codec.binary.Base64
				Encoder encoder = Base64.getEncoder();
				byte[] encodeBytes = encoder.encode(targetBytes);
				result = new String(encodeBytes);
				System.out.println("result는 : " + result);
				return result; // String
				//System.out.println("result="+ result);
				

			} catch (IOException e) {
				e.printStackTrace();
				return "error";
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "error";
			}

		}

		// 단문 SMS 발송 하기
		//
		@RequestMapping(value = "/phonenum_authorization", method = { RequestMethod.POST, RequestMethod.GET })
		@ResponseBody
		public String phonenum_authorization(HttpServletRequest request, Model model, String user_phonenum, String access_token) {

			String identity_num = numberGen(6, 1);
			// String encText = Base64Utils.encodeToString(("아이디" + ":" +
			// "인증키").getBytes(StandardCharsets.UTF_8));

			System.out.println("인증번호 : " + identity_num + " 전화번호 : " + user_phonenum + "토큰 : " + access_token);
			OkHttpClient client = new OkHttpClient();
			MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
			RequestBody body = RequestBody.create(mediaType, "phone=" + user_phonenum + "&callback=01034582410&message=" // 발신 번호 등록 (01034582410)
					+ "피버 인증번호는%20" + identity_num + "%20입니다.&refkey=RESTAPITEST1547509987"); // 발송 메시지
			Request request1 = new Request.Builder()
					.url("https://sms.gabia.com/api/send/sms")
					.post(body)
					.addHeader("Content-Type", "application/x-www-form-urlencoded")
					.addHeader("Authorization", "Basic " + access_token)
					.addHeader("cache-control", "no-cache")
					.build();

			try {
				// 요청 전송
				Response response = client.newCall(request1).execute();
				String result = response.body().string();
//				System.out.println("response body: " + response.body().string());
//				System.out.println("response : " + response.toString());
				JSONParser parser = new JSONParser();
				
				try {
					Object obj = parser.parse(result);
					JSONObject jsonObj = (JSONObject) obj;
					String message = (String) jsonObj.get("message");
					System.out.println("message : " + message);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}

			return identity_num;
		}
		
	@ResponseBody
	@RequestMapping(value = "/joinUser", method = RequestMethod.POST)
	public int joinUser(UserDTO userDto) {
		int result = datadao.insertUser(userDto);
		if(result > 0) {
			
			result = datadao.selectGetUserInfo(userDto);
			
		}
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectUser", method = RequestMethod.POST)
	public int selectUser(UserDTO userDto) {
		int result = datadao.selectGetUserInfo(userDto);
		return result;
	}
	
	
//	@ResponseBody
//	@RequestMapping(value = "/selectUser", method = RequestMethod.POST)
//	public int selectUser(UserDTO userDto) {
//		int result = datadao.selectUser(userDto);
//		if(result != 0) {
//			
//			result = datadao.selectGetUserInfo(userDto);
//			
//		}else {
//			result = datadao.insertUser(userDto);
//			if(result > 0) {
//				result = userDto.getUser_idx();
//			}else {
//				result = -1;
//			}
//		}
//		return result;
//	}
	
	
	@ResponseBody
	@RequestMapping(value = "/selectStadium", method = RequestMethod.GET)
	public List<StatiumDTO> selectStadium() {
		List<StatiumDTO> result = datadao.selectStadium();
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/searchStadium", method = RequestMethod.GET)
	public List<StatiumDTO> searchStadium(String stadium_name) {
		List<StatiumDTO> result = datadao.searchStadium(stadium_name);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectMyVideo", method = RequestMethod.GET)
	public List<VideoDTO> selectMyVideo(int user_idx) {
		List<VideoDTO> result = datadao.selectMyVideo(user_idx);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertVideo", method = RequestMethod.POST)
	public int insertVideo(VideoDTO videoDto) {
		int result = datadao.insertVideo(videoDto);		
		return result;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/selectCoupon2", method = RequestMethod.GET)
	public List<CouponHasUserDTO> selectCoupon2(int user_idx) {
		List<CouponHasUserDTO> result = datadao.selectCoupon2(user_idx);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertCouponHasUser", method = RequestMethod.POST)
	public int insertCouponHasUser(CouponHasUserDTO couponHasUserDto) {
		int result = datadao.insertCouponHasUser(couponHasUserDto);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertCard", method = RequestMethod.POST)
	public int insertCard(CardDTO cardDto) {
		int result = datadao.insertCard(cardDto);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectCard", method = RequestMethod.GET)
	public List<CardDTO> selectCard(int user_idx) {
		List<CardDTO> result = datadao.selectCard(user_idx);		
		return result;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/selectAlram", method = RequestMethod.GET)
	public List<AlramDTO> selectAlram(int user_idx) {
		List<AlramDTO> result = datadao.selectAlram(user_idx);		
		return result;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/selectStadiumQR", method = RequestMethod.GET)
	public StatiumDTO selectStadiumQR(String stadiumQR) {
		StatiumDTO result = datadao.selectStadiumQR(stadiumQR);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
	public int updateUserInfo(UserDTO userDto) {
		int result = datadao.updateUserInfo(userDto);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectVideoAndStadium", method = RequestMethod.GET)
	public List<VideoAndStadium> selectVideoAndStadium(int user_idx) {
		List<VideoAndStadium> result = datadao.selectVideoAndStadium(user_idx);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertUserHasAlram", method = RequestMethod.POST)
	public int insertUserHasAlram(int user_idx, int alram_idx) {
		System.out.println("user_idx? " + user_idx);
		System.out.println("alram_idx? " + alram_idx);
		int result = datadao.insertUserHasAlram(user_idx, alram_idx);		
		return result;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/selecHasNewAlram", method = RequestMethod.GET)
	public int selecHasNewAlram(int user_idx) {
		int result = datadao.selecHasNewAlram(user_idx);		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectAllAlram", method = RequestMethod.GET)
	public List<AlramDTO> selectAllAlram(int user_idx) {
		List<AlramDTO> result = datadao.selectAllAlram(user_idx);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertHasAlram", method = RequestMethod.POST)
	public int insertHasAlram(String jarr) {
		
		System.out.println("알람 IDX " + jarr);
		JSONArray jsonArr = new JSONArray(jarr); 
		List<HasAlram> list = new ArrayList<HasAlram>();
		Gson gson = new Gson();
		for(int i = 0; i < jsonArr.length(); i++) {
			list.add(gson.fromJson(jsonArr.get(i).toString(), HasAlram.class));
		}
		
		int result = datadao.insertHasAlram(list);
		return result;
	}
	
	
}
