package com.dcfund.ra.user_preference.entity;

import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

import com.dcfund.ra.user_preference.entity.*;

/**
 * 用户调查计算结果信息
 * @author wangming 20151216
 */

public class UserSurverResult {
	private String m_userId;
    private String m_surverDate;
    private int m_cashFlowPreference;
    private int m_riskTolerance;
    private int m_riskControlPreference;
    private String m_stylePreference1;
    private String m_stylePreference2;
    private String m_stylePreference3;
    private String m_insertedDate;
    
    
    public UserSurverResult(){
    	
    }
    
    public void CalculateUserSurverResult(UserSurver user_surver){
    	
    }

	public void setUserId(String userId) {
		this.m_userId = userId;
	}

	public String getUserId() {
		return m_userId;
	}

	public void setSurverDate(String surverDate) {
		this.m_surverDate = surverDate;
	}

	public String getSurverDate() {
		return m_surverDate;
	}

	public void setCashFlowPreference(int cashFlowPreference) {
		this.m_cashFlowPreference = cashFlowPreference;
	}

	public int getCashFlowPreference() {
		return m_cashFlowPreference;
	}

	public void setRiskTolerance(int riskTolerance) {
		this.m_riskTolerance = riskTolerance;
	}

	public int getRiskTolerance() {
		return m_riskTolerance;
	}

	public void setRiskControlPreference(int riskControlPreference) {
		this.m_riskControlPreference = riskControlPreference;
	}

	public int getRiskControlPreference() {
		return m_riskControlPreference;
	}

	public void setStylePreference1(String stylePreference1) {
		this.m_stylePreference1 = stylePreference1;
	}

	public String getStylePreference1() {
		return m_stylePreference1;
	}

	public void setStylePreference3(String stylePreference3) {
		this.m_stylePreference3 = stylePreference3;
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

	public void setStylePreference2(String m_stylePreference2) {
		this.m_stylePreference2 = m_stylePreference2;
	}

	public String getStylePreference2() {
		return m_stylePreference2;
	}
    
}