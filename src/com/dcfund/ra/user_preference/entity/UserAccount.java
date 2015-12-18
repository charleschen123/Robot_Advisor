package com.dcfund.ra.user_preference.entity;

/**
 * 用户基本账户信息
 * @author wangming 20151216
 */


public class UserAccount {
	private String userId;
	private String userName;
	private String name;
	private String birthday;
	private int gender;
	private String accountStatus;
	private String accountDate;
	private String insertedDate;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getGender() {
		return gender;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountDate(String accountDate) {
		this.accountDate = accountDate;
	}
	public String getAccountDate() {
		return accountDate;
	}
	public void setInsertedDate(String insertedDate) {
		this.insertedDate = insertedDate;
	}
	public String getInsertedDate() {
		return insertedDate;
	}
}