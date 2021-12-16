package com.spring.project.Dto;

public class VideoDTO {
	private int video_idx;
	private String video_url;
	private String video_title;
	private int stadium_stadium_idx;
	private int user_user_idx;
	private String video_createTime;
	private String video_updateTime;
	
	
	public VideoDTO() {
		
	}
	
	public VideoDTO(int video_idx, String video_url, String video_title, int stadium_stadium_idx, int user_user_idx,
			String video_createTime, String video_updateTime) {
		super();
		this.video_idx = video_idx;
		this.video_url = video_url;
		this.video_title = video_title;
		this.stadium_stadium_idx = stadium_stadium_idx;
		this.user_user_idx = user_user_idx;
		this.video_createTime = video_createTime;
		this.video_updateTime = video_updateTime;
	}
	public int getVideo_idx() {
		return video_idx;
	}
	public void setVideo_idx(int video_idx) {
		this.video_idx = video_idx;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getVideo_title() {
		return video_title;
	}
	public void setVideo_title(String video_title) {
		this.video_title = video_title;
	}
	public int getStadium_stadium_idx() {
		return stadium_stadium_idx;
	}
	public void setStadium_stadium_idx(int stadium_stadium_idx) {
		this.stadium_stadium_idx = stadium_stadium_idx;
	}
	public int getUser_user_idx() {
		return user_user_idx;
	}
	public void setUser_user_idx(int user_user_idx) {
		this.user_user_idx = user_user_idx;
	}
	public String getVideo_createTime() {
		return video_createTime;
	}
	public void setVideo_createTime(String video_createTime) {
		this.video_createTime = video_createTime;
	}
	public String getVideo_updateTime() {
		return video_updateTime;
	}
	public void setVideo_updateTime(String video_updateTime) {
		this.video_updateTime = video_updateTime;
	}
	
	
	

}
