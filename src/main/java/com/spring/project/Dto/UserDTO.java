package com.spring.project.Dto;

public class UserDTO {
	private int user_idx;
	private String user_name;
	private String user_residentregistration_number;
	private String user_phone;
	private String user_createTime;
	private String user_updateTime;
	
	
	public UserDTO() {
		
	}
	
	public UserDTO(int user_idx, String user_name, String user_residentregistration_number, String user_phone,
			String user_createTime, String user_updateTime) {
		super();
		this.user_idx = user_idx;
		this.user_name = user_name;
		this.user_residentregistration_number = user_residentregistration_number;
		this.user_phone = user_phone;
		this.user_createTime = user_createTime;
		this.user_updateTime = user_updateTime;
	}
	public int getUser_idx() {
		return user_idx;
	}
	public void setUser_idx(int user_idx) {
		this.user_idx = user_idx;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_residentregistration_number() {
		return user_residentregistration_number;
	}
	public void setUser_residentregistration_number(String user_residentregistration_number) {
		this.user_residentregistration_number = user_residentregistration_number;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_createTime() {
		return user_createTime;
	}
	public void setUser_createTime(String user_createTime) {
		this.user_createTime = user_createTime;
	}
	public String getUser_updateTime() {
		return user_updateTime;
	}
	public void setUser_updateTime(String user_updateTime) {
		this.user_updateTime = user_updateTime;
	}
	
	
	
	

}
