
package com.spring.project.Dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.Dto.AlramDTO;
import com.spring.project.Dto.CardDTO;
import com.spring.project.Dto.CouponHasUserDTO;
import com.spring.project.Dto.HasAlram;
import com.spring.project.Dto.StatiumDTO;
import com.spring.project.Dto.UserDTO;
import com.spring.project.Dto.VideoAndStadium;
import com.spring.project.Dto.VideoDTO;

@Service
public class dataDAO {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int insertUser(UserDTO userDTO) {
		return sqlSession.insert("insertUser", userDTO);
	}
	
	public int selectUser(UserDTO userDTO) {
		return sqlSession.selectOne("selectUser", userDTO);
	}
	
	public int selectGetUserInfo(UserDTO userDTO){
		return sqlSession.selectOne("selectGetUserInfo", userDTO);
	}
	
	
	
	
	public List<StatiumDTO> selectStadium(){
		return sqlSession.selectList("selectStadium");
	}
	
	public List<StatiumDTO> searchStadium(String stadium_name){
		return sqlSession.selectList("searchStadium", stadium_name);
	}
	
	public List<VideoDTO> selectMyVideo(int user_idx){
		return sqlSession.selectList("selectMyVideo", user_idx);
	}
	
	public int insertVideo(VideoDTO videoDto) {
		return sqlSession.insert("insertVideo", videoDto);
	}
	
	public List<CouponHasUserDTO> selectCoupon2(int user_idx) {
		return sqlSession.selectList("selectCoupon2", user_idx);
	}
	
	public int insertCouponHasUser(CouponHasUserDTO couponHasUserDto) {
		return sqlSession.insert("insertCouponHasUser", couponHasUserDto);
	}
	
	public int insertCard(CardDTO cardDto) {
		return sqlSession.insert("insertCard", cardDto);
	}
	
	public List<CardDTO> selectCard(int user_idx){
		return sqlSession.selectList("selectCard", user_idx);
	}
	
	
	public List<AlramDTO> selectAlram(int user_idx){
		return sqlSession.selectList("selectAlram", user_idx);
	}
	
	public StatiumDTO selectStadiumQR(String stadiumQR){
		return sqlSession.selectOne("selectStadiumQR", stadiumQR);
	}
	
	public int updateUserInfo(UserDTO userDto) {
		return sqlSession.update("updateUserInfo", userDto);
		
	}
	
	public List<VideoAndStadium> selectVideoAndStadium(int user_idx) {
		return sqlSession.selectList("selectVideoAndStadium", user_idx);
		
	}
	
	public int insertUserHasAlram(int user_idx, int alram_idx) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		hashmap.put("user_idx", user_idx);
		hashmap.put("alram_idx", alram_idx);
		return sqlSession.selectOne("insertUserHasAlram", hashmap);
	}
	
	public int selecHasNewAlram(int user_idx) {
		return sqlSession.selectOne("selecHasNewAlram", user_idx);
	}
	
	public List<AlramDTO> selectAllAlram(int user_idx) {
		return sqlSession.selectList("selectAllAlram", user_idx);
	}
	
	public int insertHasAlram(List<HasAlram> list) {
		return sqlSession.insert("insertHasAlram", list);
	}

}
