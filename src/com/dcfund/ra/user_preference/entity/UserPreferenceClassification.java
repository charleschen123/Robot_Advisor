package com.dcfund.ra.user_preference.entity;


/**
 * 用户偏好分类信息
 * @author wangming 20151216
 */


public class UserPreferenceClassification {
	private String userId;
	private String timeStamp;
	private int userTypeId;
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public int getUserTypeId() {
		return userTypeId;
	}
	
	
}