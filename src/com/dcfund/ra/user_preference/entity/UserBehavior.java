package com.dcfund.ra.user_preference.entity;

/**
 * 用户调整信息
 * @author wangming 20151216
 */

public class UserBehavior {
	private String userId;
	private String timeStamp;
	private String userBehaviorType;
	private int behaviorValue;
	private int behaviorTarget;
	private int behaviorReference;
	
	
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
	public void setUserBehaviorType(String userBehaviorType) {
		this.userBehaviorType = userBehaviorType;
	}
	public String getUserBehaviorType() {
		return userBehaviorType;
	}
	public void setBehaviorValue(int behaviorValue) {
		this.behaviorValue = behaviorValue;
	}
	public int getBehaviorValue() {
		return behaviorValue;
	}
	public void setBehaviorTarget(int behaviorTarget) {
		this.behaviorTarget = behaviorTarget;
	}
	public int getBehaviorTarget() {
		return behaviorTarget;
	}
	public void setBehaviorReference(int behaviorReference) {
		this.behaviorReference = behaviorReference;
	}
	public int getBehaviorReference() {
		return behaviorReference;
	}
}