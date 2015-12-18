package com.dcfund.ra.user_preference.entity;


/**
 * 用户调查信息
 * @author wangming 20151216
 */

public class UserSurver{
	
	private String m_userId;
	private int m_familyIncomeLevel;
	private int m_ageLevel;
	private int m_investTargetLevel;
	private int m_lossLevel;
	private String m_stylePreference1;
	private String m_stylePreference2;
	private String m_stylePreference3;
	private String m_insertedDate;
	private String m_surverDate;
	
	public UserSurver(){
	    
	}

	public void setUserId(String m_userId) {
		this.m_userId = m_userId;
	}

	public String getUserId() {
		return m_userId;
	}

	public void setFamilyIncomeLevel(int m_familyIncomeLevel) {
		this.m_familyIncomeLevel = m_familyIncomeLevel;
	}

	public int getFamilyIncomeLevel() {
		return m_familyIncomeLevel;
	}

	public void setAgeLevel(int m_ageLevel) {
		this.m_ageLevel = m_ageLevel;
	}

	public int getAgeLevel() {
		return m_ageLevel;
	}

	public void setInvestTargetLevel(int m_investTargetLevel) {
		this.m_investTargetLevel = m_investTargetLevel;
	}

	public int getInvestTargetLevel() {
		return m_investTargetLevel;
	}

	public void setLossLevel(int m_lossLevel) {
		this.m_lossLevel = m_lossLevel;
	}

	public int getLossLevel() {
		return m_lossLevel;
	}

	public void setStylePreference1(String m_stylePreference1) {
		this.m_stylePreference1 = m_stylePreference1;
	}

	public String getStylePreference1() {
		return m_stylePreference1;
	}

	public void setStylePreference2(String m_stylePreference2) {
		this.m_stylePreference2 = m_stylePreference2;
	}

	public String getStylePreference2() {
		return m_stylePreference2;
	}

	public void setStylePreference3(String m_stylePrefernece3) {
		this.m_stylePreference3 = m_stylePrefernece3;
	}

	public String getStylePreference3() {
		return m_stylePreference3;
	}

	public void setInsertedDate(String insertedDate) {
		this.m_insertedDate = insertedDate;
	}

	public String getInsertedDate() {
		return m_insertedDate;
	}

	public void setSurverDate(String m_surverDate) {
		this.m_surverDate = m_surverDate;
	}

	public String getSurverDate() {
		return m_surverDate;
	}
	
}