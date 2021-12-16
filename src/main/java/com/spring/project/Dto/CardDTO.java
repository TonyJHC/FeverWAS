package com.spring.project.Dto;

public class CardDTO {
	private int card_idx;
	private int user_user_idx; 
	private String card_company_name;
	private String card_number; 
	private String card_createTime;
	private String card_updateTime;
	
	public CardDTO() {
		
	}
	
	public CardDTO(int card_idx, int user_user_idx, String card_company_name, String card_number,
			String card_createTime, String card_updateTime) {
		super();
		this.card_idx = card_idx;
		this.user_user_idx = user_user_idx;
		this.card_company_name = card_company_name;
		this.card_number = card_number;
		this.card_createTime = card_createTime;
		this.card_updateTime = card_updateTime;
	}
	public int getCard_idx() {
		return card_idx;
	}
	public void setCard_idx(int card_idx) {
		this.card_idx = card_idx;
	}
	public int getUser_user_idx() {
		return user_user_idx;
	}
	public void setUser_user_idx(int user_user_idx) {
		this.user_user_idx = user_user_idx;
	}
	public String getCard_company_name() {
		return card_company_name;
	}
	public void setCard_company_name(String card_company_name) {
		this.card_company_name = card_company_name;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getCard_createTime() {
		return card_createTime;
	}
	public void setCard_createTime(String card_createTime) {
		this.card_createTime = card_createTime;
	}
	public String getCard_updateTime() {
		return card_updateTime;
	}
	public void setCard_updateTime(String card_updateTime) {
		this.card_updateTime = card_updateTime;
	}
	
	
	
}
