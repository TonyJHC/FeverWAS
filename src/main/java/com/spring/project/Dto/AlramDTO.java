package com.spring.project.Dto;

public class AlramDTO {
	private int alram_idx;
	private int alram_user_idx;
	private String alram_title;
	private String alram_content;
	private String alram_createtime;
	private String alram_updatetime;
	private int checked;
	
	
	public AlramDTO() {
		
	}
	
	public AlramDTO(int alram_idx, int alram_user_idx, String alram_title, String alram_content,
			String alram_createtime, String alram_updatetime, int checked) {
		super();
		this.alram_idx = alram_idx;
		this.alram_user_idx = alram_user_idx;
		this.alram_title = alram_title;
		this.alram_content = alram_content;
		this.alram_createtime = alram_createtime;
		this.alram_updatetime = alram_updatetime;
		this.checked = checked;
	}
	
	public int getAlram_idx() {
		return alram_idx;
	}
	public void setAlram_idx(int alram_idx) {
		this.alram_idx = alram_idx;
	}
	public int getAlram_user_idx() {
		return alram_user_idx;
	}
	public void setAlram_user_idx(int alram_user_idx) {
		this.alram_user_idx = alram_user_idx;
	}
	public String getAlram_title() {
		return alram_title;
	}
	public void setAlram_title(String alram_title) {
		this.alram_title = alram_title;
	}
	public String getAlram_content() {
		return alram_content;
	}
	public void setAlram_content(String alram_content) {
		this.alram_content = alram_content;
	}
	public String getAlram_createtime() {
		return alram_createtime;
	}
	public void setAlram_createtime(String alram_createtime) {
		this.alram_createtime = alram_createtime;
	}
	public String getAlram_updatetime() {
		return alram_updatetime;
	}
	public void setAlram_updatetime(String alram_updatetime) {
		this.alram_updatetime = alram_updatetime;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}

	
	
	
	
	
}
