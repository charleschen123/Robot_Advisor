package com.dcfund.ra.user_preference.entity;


/**
 * �û�ƫ���������Ϣ
 * @author wangming 20151216
 */

public class UserTypeDefinition {
	
	//��ô����ı���������Ϊ��������DBUtil��ѯ��ʱ��ʹ��BeanListHandler, 
	//javabean���������������ݿ��Ӧ���Ԫ�ض�Ӧ��rilegoule
	private int User_Type_Id;
	private int Cash_Flow_Preference_Type;
	private int Risk_Preference_Type;
	
	/*
	public void setUserTypeId(int userTypeId) {
		this.User_Type_Id = userTypeId;
	}
	public int getUserTypeId() {
		return User_Type_Id;
	}
	public void setCashFlowPreferenceType(int cashFlowPreferenceType) {
		this.Cash_Flow_Preference_Type = cashFlowPreferenceType;
	}
	public int getCashFlowPreferenceType() {
		return Cash_Flow_Preference_Type;
	}
	
	public void setRiskPreferenceType(int riskPreferenceType) {
		this.Risk_Preference_Type = riskPreferenceType;
	}
	public int getRiskPreferenceType() {
		return Risk_Preference_Type;
	}*/
	public void setRisk_Preference_Type(int risk_Preference_Type) {
		Risk_Preference_Type = risk_Preference_Type;
	}
	public int getRisk_Preference_Type() {
		return Risk_Preference_Type;
	}
	public void setUser_Type_Id(int user_Type_Id) {
		User_Type_Id = user_Type_Id;
	}
	public int getUser_Type_Id() {
		return User_Type_Id;
	}
	public void setCash_Flow_Preference_Type(int cash_Flow_Preference_Type) {
		Cash_Flow_Preference_Type = cash_Flow_Preference_Type;
	}
	public int getCash_Flow_Preference_Type() {
		return Cash_Flow_Preference_Type;
	}
}