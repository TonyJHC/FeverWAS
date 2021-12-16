package com.spring.project.Dto;

public class StatiumDTO {
	private int stadium_idx;
	private String stadium_name;
	private String stadium_address; 
	private String stadium_operating_hours;
	private String stadium_number;
	private String stadium_latitude; 
	private String stadium_longitute;
	private int stadium_trouble_state;
	private String stadiumQR; 
	private String stadium_img;
	private String stadium_createTime;
	private String stadium_updateTine;
	
	
	
	public StatiumDTO() {
		
	}
	
	public StatiumDTO(int stadium_idx, String stadium_name, String stadium_address, String stadium_operating_hours,
			String stadium_number, String stadium_latitude, String stadium_longitute, int stadium_trouble_state,
			String stadiumQR, String stadium_img, String stadium_createTime, String stadium_updateTine) {
		super();
		this.stadium_idx = stadium_idx;
		this.stadium_name = stadium_name;
		this.stadium_address = stadium_address;
		this.stadium_operating_hours = stadium_operating_hours;
		this.stadium_number = stadium_number;
		this.stadium_latitude = stadium_latitude;
		this.stadium_longitute = stadium_longitute;
		this.stadium_trouble_state = stadium_trouble_state;
		this.stadiumQR = stadiumQR;
		this.stadium_img = stadium_img;
		this.stadium_createTime = stadium_createTime;
		this.stadium_updateTine = stadium_updateTine;
	}
	public int getStadium_idx() {
		return stadium_idx;
	}
	public void setStadium_idx(int stadium_idx) {
		this.stadium_idx = stadium_idx;
	}
	public String getStadium_name() {
		return stadium_name;
	}
	public void setStadium_name(String stadium_name) {
		this.stadium_name = stadium_name;
	}
	public String getStadium_address() {
		return stadium_address;
	}
	public void setStadium_address(String stadium_address) {
		this.stadium_address = stadium_address;
	}
	public String getStadium_operating_hours() {
		return stadium_operating_hours;
	}
	public void setStadium_operating_hours(String stadium_operating_hours) {
		this.stadium_operating_hours = stadium_operating_hours;
	}
	public String getStadium_number() {
		return stadium_number;
	}
	public void setStadium_number(String stadium_number) {
		this.stadium_number = stadium_number;
	}
	public String getStadium_latitude() {
		return stadium_latitude;
	}
	public void setStadium_latitude(String stadium_latitude) {
		this.stadium_latitude = stadium_latitude;
	}
	public String getStadium_longitute() {
		return stadium_longitute;
	}
	public void setStadium_longitute(String stadium_longitute) {
		this.stadium_longitute = stadium_longitute;
	}
	public int getStadium_trouble_state() {
		return stadium_trouble_state;
	}
	public void setStadium_trouble_state(int stadium_trouble_state) {
		this.stadium_trouble_state = stadium_trouble_state;
	}
	public String getStadiumQR() {
		return stadiumQR;
	}
	public void setStadiumQR(String stadiumQR) {
		this.stadiumQR = stadiumQR;
	}
	
	public String getStadium_img() {
		return stadium_img;
	}

	public void setStadium_img(String stadium_img) {
		this.stadium_img = stadium_img;
	}

	public String getStadium_createTime() {
		return stadium_createTime;
	}
	public void setStadium_createTime(String stadium_createTime) {
		this.stadium_createTime = stadium_createTime;
	}
	public String getStadium_updateTine() {
		return stadium_updateTine;
	}
	public void setStadium_updateTine(String stadium_updateTine) {
		this.stadium_updateTine = stadium_updateTine;
	}
	
	
}
