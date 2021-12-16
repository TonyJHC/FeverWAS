package com.spring.project.Dto;

public class HasAlram {
	private int user_user_idx;
	private int alram_alram_idx;
	
	
	public HasAlram() {
		
	}
	
	public HasAlram(int user_user_idx, int alram_alram_idx) {
		super();
		this.user_user_idx = user_user_idx;
		this.alram_alram_idx = alram_alram_idx;
	}
	
	public int getUser_user_idx() {
		return user_user_idx;
	}
	
	public void setUser_user_idx(int user_user_idx) {
		this.user_user_idx = user_user_idx;
	}
	
	public int getAlram_alram_idx() {
		return alram_alram_idx;
	}
	
	public void setAlram_alram_idx(int alram_alram_idx) {
		this.alram_alram_idx = alram_alram_idx;
	}
	
	
}
