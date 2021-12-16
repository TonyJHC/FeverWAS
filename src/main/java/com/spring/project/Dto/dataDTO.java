package com.spring.project.Dto;

public class dataDTO {

	// 유저
	private double temperature;
	private int user_idx;
	private int authorityidx;
	private String user_id;
	private String user_name;
	private String user_email;
	private String user_tel;
	private int enabled;
	private String user_createtime;
	private String user_updatetime;

	// 비디오
	private int video_idx;
	private String video_title;
	private String video_contents;
	private String video_url;
	private String video_type;
	private String video_create_time;
	private String video_update_time;

	// 퀴즈
	private int oxquiz_idx;
	private String oxquiz_title;
	private String oxquiz_subtitle;
	private String oxquiz_contents;
	private String oxquiz_url;
	private String oxquiz_create_time;
	private String oxquiz_update_time;

	// 퀴즈 문제
	private int question_idx;
	private int oxquiz_oxquiz_idx;
	private String question_title;
	private String question_url;
	private String question_explanation;
	private String question_answer;
	private String question_create_time;
	private String question_update_time;

	// 배너
	private int banner_idx;
	private String banner_title;
	private String banner_url;
	private String banner_path;
	private String banner_create_time;
	private String banner_update_time;

	// 게시판
	private int board_idx;
	private String board_title;
	private String board_contents;
	private String board_url;
	private int board_type;
	private String board_create_time;
	private String board_update_time;

	// 퀴즈 히스토리
	private int oxquiz_history_idx;
	private int oxquiz_history_user_idx;
	private int oxquiz_history_oxquiz_idx;
	private String oxquiz_history_create_time;
	private String oxquiz_history_update_time;

	// 문항 히스토리

	private int question_history_idx;
	private int question_history_user_idx;
	private int question_history_question_idx;
	private String question_history_create_time;
	private String question_history_update_time;
	private int question_history_answer;

	// 비디오 히스토리

	private int video_history_idx;
	private int history_video_user_idx;
	private int video_video_video_idx;
	private String video_history_create_time;
	private String video_history_update_time;

	private int count, totalcount;

	// 앱버전
	private int version_idx;
	private String version_name;
	private String version_create_time;
	private String version_update_time;
	
	
	
	public dataDTO() {
	}

	
	
	

	public dataDTO(double temperature, int user_idx, int authorityidx, String user_id, String user_name,
			String user_email, String user_tel, int enabled, String user_createtime, String user_updatetime,
			int video_idx, String video_title, String video_contents, String video_url, String video_type,
			String video_create_time, String video_update_time, int oxquiz_idx, String oxquiz_title,
			String oxquiz_subtitle, String oxquiz_contents, String oxquiz_url, String oxquiz_create_time,
			String oxquiz_update_time, int question_idx, int oxquiz_oxquiz_idx, String question_title,
			String question_url, String question_explanation, String question_answer, String question_create_time,
			String question_update_time, int banner_idx, String banner_title, String banner_url, String banner_path,
			String banner_create_time, String banner_update_time, int board_idx, String board_title,
			String board_contents, String board_url, int board_type, String board_create_time, String board_update_time,
			int oxquiz_history_idx, int oxquiz_history_user_idx, int oxquiz_history_oxquiz_idx,
			String oxquiz_history_create_time, String oxquiz_history_update_time, int question_history_idx,
			int question_history_user_idx, int question_history_question_idx, String question_history_create_time,
			String question_history_update_time, int question_history_answer, int video_history_idx,
			int history_video_user_idx, int video_video_video_idx, String video_history_create_time,
			String video_history_update_time, int count, int totalcount, int version_idx, String version_name,
			String version_create_time, String version_update_time) {
		super();
		this.temperature = temperature;
		this.user_idx = user_idx;
		this.authorityidx = authorityidx;
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_tel = user_tel;
		this.enabled = enabled;
		this.user_createtime = user_createtime;
		this.user_updatetime = user_updatetime;
		this.video_idx = video_idx;
		this.video_title = video_title;
		this.video_contents = video_contents;
		this.video_url = video_url;
		this.video_type = video_type;
		this.video_create_time = video_create_time;
		this.video_update_time = video_update_time;
		this.oxquiz_idx = oxquiz_idx;
		this.oxquiz_title = oxquiz_title;
		this.oxquiz_subtitle = oxquiz_subtitle;
		this.oxquiz_contents = oxquiz_contents;
		this.oxquiz_url = oxquiz_url;
		this.oxquiz_create_time = oxquiz_create_time;
		this.oxquiz_update_time = oxquiz_update_time;
		this.question_idx = question_idx;
		this.oxquiz_oxquiz_idx = oxquiz_oxquiz_idx;
		this.question_title = question_title;
		this.question_url = question_url;
		this.question_explanation = question_explanation;
		this.question_answer = question_answer;
		this.question_create_time = question_create_time;
		this.question_update_time = question_update_time;
		this.banner_idx = banner_idx;
		this.banner_title = banner_title;
		this.banner_url = banner_url;
		this.banner_path = banner_path;
		this.banner_create_time = banner_create_time;
		this.banner_update_time = banner_update_time;
		this.board_idx = board_idx;
		this.board_title = board_title;
		this.board_contents = board_contents;
		this.board_url = board_url;
		this.board_type = board_type;
		this.board_create_time = board_create_time;
		this.board_update_time = board_update_time;
		this.oxquiz_history_idx = oxquiz_history_idx;
		this.oxquiz_history_user_idx = oxquiz_history_user_idx;
		this.oxquiz_history_oxquiz_idx = oxquiz_history_oxquiz_idx;
		this.oxquiz_history_create_time = oxquiz_history_create_time;
		this.oxquiz_history_update_time = oxquiz_history_update_time;
		this.question_history_idx = question_history_idx;
		this.question_history_user_idx = question_history_user_idx;
		this.question_history_question_idx = question_history_question_idx;
		this.question_history_create_time = question_history_create_time;
		this.question_history_update_time = question_history_update_time;
		this.question_history_answer = question_history_answer;
		this.video_history_idx = video_history_idx;
		this.history_video_user_idx = history_video_user_idx;
		this.video_video_video_idx = video_video_video_idx;
		this.video_history_create_time = video_history_create_time;
		this.video_history_update_time = video_history_update_time;
		this.count = count;
		this.totalcount = totalcount;
		this.version_idx = version_idx;
		this.version_name = version_name;
		this.version_create_time = version_create_time;
		this.version_update_time = version_update_time;
	}





	public String getOxquiz_subtitle() {
		return oxquiz_subtitle;
	}





	public void setOxquiz_subtitle(String oxquiz_subtitle) {
		this.oxquiz_subtitle = oxquiz_subtitle;
	}





	public int getVersion_idx() {
		return version_idx;
	}

	public void setVersion_idx(int version_idx) {
		this.version_idx = version_idx;
	}

	public String getVersion_name() {
		return version_name;
	}

	public void setVersion_name(String version_name) {
		this.version_name = version_name;
	}

	public String getVersion_create_time() {
		return version_create_time;
	}

	public void setVersion_create_time(String version_create_time) {
		this.version_create_time = version_create_time;
	}

	public String getVersion_update_time() {
		return version_update_time;
	}

	public void setVersion_update_time(String version_update_time) {
		this.version_update_time = version_update_time;
	}

	public int getTotalcount() {
		return totalcount;
	}

	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	public int getOxquiz_history_idx() {
		return oxquiz_history_idx;
	}

	public void setOxquiz_history_idx(int oxquiz_history_idx) {
		this.oxquiz_history_idx = oxquiz_history_idx;
	}

	public int getOxquiz_history_user_idx() {
		return oxquiz_history_user_idx;
	}
 
	public void setOxquiz_history_user_idx(int oxquiz_history_user_idx) {
		this.oxquiz_history_user_idx = oxquiz_history_user_idx;
	}

	public int getOxquiz_history_oxquiz_idx() {
		return oxquiz_history_oxquiz_idx;
	}

	public void setOxquiz_history_oxquiz_idx(int oxquiz_history_oxquiz_idx) {
		this.oxquiz_history_oxquiz_idx = oxquiz_history_oxquiz_idx;
	}

	public String getOxquiz_history_create_time() {
		return oxquiz_history_create_time;
	}

	public void setOxquiz_history_create_time(String oxquiz_history_create_time) {
		this.oxquiz_history_create_time = oxquiz_history_create_time;
	}

	public String getOxquiz_history_update_time() {
		return oxquiz_history_update_time;
	}

	public void setOxquiz_history_update_time(String oxquiz_history_update_time) {
		this.oxquiz_history_update_time = oxquiz_history_update_time;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getUser_idx() {
		return user_idx;
	}

	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}

	public int getAuthorityidx() {
		return authorityidx;
	}

	public void setAuthorityidx(int authorityidx) {
		this.authorityidx = authorityidx;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getUser_createtime() {
		return user_createtime;
	}

	public void setUser_createtime(String user_createtime) {
		this.user_createtime = user_createtime;
	}

	public String getUser_updatetime() {
		return user_updatetime;
	}

	public void setUser_updatetime(String user_updatetime) {
		this.user_updatetime = user_updatetime;
	}

	public int getVideo_idx() {
		return video_idx;
	}

	public void setVideo_idx(int video_idx) {
		this.video_idx = video_idx;
	}

	public String getVideo_title() {
		return video_title;
	}

	public void setVideo_title(String video_title) {
		this.video_title = video_title;
	}

	public String getVideo_contents() {
		return video_contents;
	}

	public void setVideo_contents(String video_contents) {
		this.video_contents = video_contents;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getVideo_type() {
		return video_type;
	}

	public void setVideo_type(String video_type) {
		this.video_type = video_type;
	}

	public String getVideo_create_time() {
		return video_create_time;
	}

	public void setVideo_create_time(String video_create_time) {
		this.video_create_time = video_create_time;
	}

	public String getVideo_update_time() {
		return video_update_time;
	}

	public void setVideo_update_time(String video_update_time) {
		this.video_update_time = video_update_time;
	}

	public int getOxquiz_idx() {
		return oxquiz_idx;
	}

	public void setOxquiz_idx(int oxquiz_idx) {
		this.oxquiz_idx = oxquiz_idx;
	}

	public String getOxquiz_title() {
		return oxquiz_title;
	}

	public void setOxquiz_title(String oxquiz_title) {
		this.oxquiz_title = oxquiz_title;
	}

	public String getOxquiz_contents() {
		return oxquiz_contents;
	}

	public void setOxquiz_contents(String oxquiz_contents) {
		this.oxquiz_contents = oxquiz_contents;
	}

	public String getOxquiz_url() {
		return oxquiz_url;
	}

	public void setOxquiz_url(String oxquiz_url) {
		this.oxquiz_url = oxquiz_url;
	}

	public String getOxquiz_create_time() {
		return oxquiz_create_time;
	}

	public void setOxquiz_create_time(String oxquiz_create_time) {
		this.oxquiz_create_time = oxquiz_create_time;
	}

	public String getOxquiz_update_time() {
		return oxquiz_update_time;
	}

	public void setOxquiz_update_time(String oxquiz_update_time) {
		this.oxquiz_update_time = oxquiz_update_time;
	}

	public int getQuestion_idx() {
		return question_idx;
	}

	public void setQuestion_idx(int question_idx) {
		this.question_idx = question_idx;
	}

	public int getOxquiz_oxquiz_idx() {
		return oxquiz_oxquiz_idx;
	}

	public void setOxquiz_oxquiz_idx(int oxquiz_oxquiz_idx) {
		this.oxquiz_oxquiz_idx = oxquiz_oxquiz_idx;
	}

	public String getQuestion_title() {
		return question_title;
	}

	public void setQuestion_title(String question_title) {
		this.question_title = question_title;
	}

	public String getQuestion_url() {
		return question_url;
	}

	public void setQuestion_url(String question_url) {
		this.question_url = question_url;
	}

	public String getQuestion_explanation() {
		return question_explanation;
	}

	public void setQuestion_explanation(String question_explanation) {
		this.question_explanation = question_explanation;
	}

	public String getQuestion_answer() {
		return question_answer;
	}

	public void setQuestion_answer(String question_answer) {
		this.question_answer = question_answer;
	}

	public String getQuestion_create_time() {
		return question_create_time;
	}

	public void setQuestion_create_time(String question_create_time) {
		this.question_create_time = question_create_time;
	}

	public String getQuestion_update_time() {
		return question_update_time;
	}

	public void setQuestion_update_time(String question_update_time) {
		this.question_update_time = question_update_time;
	}

	public int getBanner_idx() {
		return banner_idx;
	}

	public void setBanner_idx(int banner_idx) {
		this.banner_idx = banner_idx;
	}

	public String getBanner_title() {
		return banner_title;
	}

	public void setBanner_title(String banner_title) {
		this.banner_title = banner_title;
	}

	public String getBanner_url() {
		return banner_url;
	}

	public void setBanner_url(String banner_url) {
		this.banner_url = banner_url;
	}

	public String getBanner_path() {
		return banner_path;
	}

	public void setBanner_path(String banner_path) {
		this.banner_path = banner_path;
	}

	public String getBanner_create_time() {
		return banner_create_time;
	}

	public void setBanner_create_time(String banner_create_time) {
		this.banner_create_time = banner_create_time;
	}

	public String getBanner_update_time() {
		return banner_update_time;
	}

	public void setBanner_update_time(String banner_update_time) {
		this.banner_update_time = banner_update_time;
	}

	public int getBoard_idx() {
		return board_idx;
	}

	public void setBoard_idx(int board_idx) {
		this.board_idx = board_idx;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_contents() {
		return board_contents;
	}

	public void setBoard_contents(String board_contents) {
		this.board_contents = board_contents;
	}

	public String getBoard_url() {
		return board_url;
	}

	public void setBoard_url(String board_url) {
		this.board_url = board_url;
	}

	public int getBoard_type() {
		return board_type;
	}

	public void setBoard_type(int board_type) {
		this.board_type = board_type;
	}

	public String getBoard_create_time() {
		return board_create_time;
	}

	public void setBoard_create_time(String board_create_time) {
		this.board_create_time = board_create_time;
	}

	public String getBoard_update_time() {
		return board_update_time;
	}

	public void setBoard_update_time(String board_update_time) {
		this.board_update_time = board_update_time;
	}

	public int getQuestion_history_idx() {
		return question_history_idx;
	}

	public void setQuestion_history_idx(int question_history_idx) {
		this.question_history_idx = question_history_idx;
	}

	public int getQuestion_history_user_idx() {
		return question_history_user_idx;
	}

	public void setQuestion_history_user_idx(int question_history_user_idx) {
		this.question_history_user_idx = question_history_user_idx;
	}

	public int getQuestion_history_question_idx() {
		return question_history_question_idx;
	}

	public void setQuestion_history_question_idx(int question_history_question_idx) {
		this.question_history_question_idx = question_history_question_idx;
	}

	public String getQuestion_history_create_time() {
		return question_history_create_time;
	}

	public void setQuestion_history_create_time(String question_history_create_time) {
		this.question_history_create_time = question_history_create_time;
	}

	public String getQuestion_history_update_time() {
		return question_history_update_time;
	}

	public void setQuestion_history_update_time(String question_history_update_time) {
		this.question_history_update_time = question_history_update_time;
	}

	public int getQuestion_history_answer() {
		return question_history_answer;
	}

	public void setQuestion_history_answer(int question_history_answer) {
		this.question_history_answer = question_history_answer;
	}

	public int getVideo_history_idx() {
		return video_history_idx;
	}

	public void setVideo_history_idx(int video_history_idx) {
		this.video_history_idx = video_history_idx;
	}

	public int getHistory_video_user_idx() {
		return history_video_user_idx;
	}

	public void setHistory_video_user_idx(int history_video_user_idx) {
		this.history_video_user_idx = history_video_user_idx;
	}

	public int getVideo_video_video_idx() {
		return video_video_video_idx;
	}

	public void setVideo_video_video_idx(int video_video_video_idx) {
		this.video_video_video_idx = video_video_video_idx;
	}

	public String getVideo_history_create_time() {
		return video_history_create_time;
	}

	public void setVideo_history_create_time(String video_history_create_time) {
		this.video_history_create_time = video_history_create_time;
	}

	public String getVideo_history_update_time() {
		return video_history_update_time;
	}

	public void setVideo_history_update_time(String video_history_update_time) {
		this.video_history_update_time = video_history_update_time;
	}

}
