package com.spring.project.Dto;

public class CouponHasUserDTO {
	private int coupon_has_user_idx;
	private int coupon_coupon_idx;
	private int user_user_idx;
	private int coupon_has_user_isUsed;
	private String coupon_has_coupon_expirationdate; 
	private String coupon_has_user_createTime;
	private String coupon_has_user_updateTime;
	
	
	public CouponHasUserDTO() {
		
	}
	
	public CouponHasUserDTO(int coupon_has_user_idx, int coupon_coupon_idx, int user_user_idx,
			String coupon_has_coupon_expirationdate, int coupon_has_user_isUsed, 
			String coupon_has_user_createTime,String coupon_has_user_updateTime) {
		super();
		this.coupon_has_user_idx = coupon_has_user_idx;
		this.coupon_coupon_idx = coupon_coupon_idx;
		this.user_user_idx = user_user_idx;
		this.coupon_has_user_isUsed = coupon_has_user_isUsed;
		this.coupon_has_coupon_expirationdate = coupon_has_coupon_expirationdate;
		this.coupon_has_user_createTime = coupon_has_user_createTime;
		this.coupon_has_user_updateTime = coupon_has_user_updateTime;
	}
	public int getCoupon_has_user_idx() {
		return coupon_has_user_idx;
	}
	public void setCoupon_has_user_idx(int coupon_has_user_idx) {
		this.coupon_has_user_idx = coupon_has_user_idx;
	}
	public int getCoupon_coupon_idx() {
		return coupon_coupon_idx;
	}
	public void setCoupon_coupon_idx(int coupon_coupon_idx) {
		this.coupon_coupon_idx = coupon_coupon_idx;
	}
	public int getUser_user_idx() {
		return user_user_idx;
	}
	public void setUser_user_idx(int user_user_idx) {
		this.user_user_idx = user_user_idx;
	}
	public String getCoupon_has_coupon_expirationdate() {
		return coupon_has_coupon_expirationdate;
	}
	public void setCoupon_has_coupon_expirationdate(String coupon_has_coupon_expirationdate) {
		this.coupon_has_coupon_expirationdate = coupon_has_coupon_expirationdate;
	}
	
	public int getCoupon_has_user_isUsed() {
		return coupon_has_user_isUsed;
	}

	public void setCoupon_has_user_isUsed(int coupon_has_user_isUsed) {
		this.coupon_has_user_isUsed = coupon_has_user_isUsed;
	}

	public String getCoupon_has_user_createTime() {
		return coupon_has_user_createTime;
	}
	public void setCoupon_has_user_createTime(String coupon_has_user_createTime) {
		this.coupon_has_user_createTime = coupon_has_user_createTime;
	}
	public String getCoupon_has_user_updateTime() {
		return coupon_has_user_updateTime;
	}
	public void setCoupon_has_user_updateTime(String coupon_has_user_updateTime) {
		this.coupon_has_user_updateTime = coupon_has_user_updateTime;
	}
	
	
}
