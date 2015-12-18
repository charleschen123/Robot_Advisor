package com.dcfund.ra.user_preference.entity;


/**
 * 用户特征信息
 * @author wangming 20151216
 */

public class UserCharacteristic {
	private String userId;
	private int liquidWealth;
	private String location;
	private String source;
	private String updateDate;
	private String insertedDate;
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setLiquidWealth(int liquidWealth) {
		this.liquidWealth = liquidWealth;
	}
	public int getLiquidWealth() {
		return liquidWealth;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return source;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setInsertedDate(String insertedDate) {
		this.insertedDate = insertedDate;
	}
	public String getInsertedDate() {
		return insertedDate;
	}
	
}