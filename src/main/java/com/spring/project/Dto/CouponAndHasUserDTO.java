package com.spring.project.Dto;

public class CouponAndHasUserDTO {
	private int coupon_has_user_idx;
	private int coupon_type;
	private String coupon_has_coupon_expirationdate;
	private String coupon_has_user_createTime;
	private String coupon_has_user_updateTime;
	
	public CouponAndHasUserDTO() {
		
	}
	
	public CouponAndHasUserDTO(int coupon_has_user_idx, int coupon_type, String coupon_has_coupon_expirationdate,
			String coupon_has_user_createTime, String coupon_has_user_updateTime) {
		super();
		this.coupon_has_user_idx = coupon_has_user_idx;
		this.coupon_type = coupon_type;
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
	public int getCoupon_type() {
		return coupon_type;
	}
	public void setCoupon_type(int coupon_type) {
		this.coupon_type = coupon_type;
	}
	public String getCoupon_has_coupon_expirationdate() {
		return coupon_has_coupon_expirationdate;
	}
	public void setCoupon_has_coupon_expirationdate(String coupon_has_coupon_expirationdate) {
		this.coupon_has_coupon_expirationdate = coupon_has_coupon_expirationdate;
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
