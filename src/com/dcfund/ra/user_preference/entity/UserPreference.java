package com.dcfund.ra.user_preference.entity;


/**
 * 用户偏好信息
 * @author wangming 20151216
 */

public class UserPreference {
	private String userId;
	private int cashFlowPreference;
	private int riskPreference;
	private String stylePreference1;
	private String stylePreference2;
	private String stylePreference3;
	
		
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setCashFlowPreference(int cashFlowPreference) {
		this.cashFlowPreference = cashFlowPreference;
	}
	public int getCashFlowPreference() {
		return cashFlowPreference;
	}
	public void setRiskPreference(int riskPreference) {
		this.riskPreference = riskPreference;
	}
	public int getRiskPreference() {
		return riskPreference;
	}
	public void setStylePreference1(String stylePreference1) {
		this.stylePreference1 = stylePreference1;
	}
	public String getStylePreference1() {
		return stylePreference1;
	}
	public void setStylePreference2(String stylePreference2) {
		this.stylePreference2 = stylePreference2;
	}
	public String getStylePreference2() {
		return stylePreference2;
	}
	public void setStylePreference3(String stylePreference3) {
		this.stylePreference3 = stylePreference3;
	}
	public String getStylePreference3() {
		return stylePreference3;
	}
	
	
}