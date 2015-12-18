package com.dcfund.ra.user_preference.logic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.sql.*;

import com.dcfund.ra.user_preference.entity.*;
import com.dcfund.ra.user_preference.entity.UserSurver;
import com.dcfund.ra.user_preference.entity.UserPreference;
import com.dcfund.ra.user_preference.entity.UserPreferenceClassification;
import com.dcfund.ra.user_preference.dao.*;
import com.dcfund.ra.user_preference.dao.UserSurverResultDaoImpl;
import com.dcfund.ra.user_preference.dao.UserPreferenceClassificationDaoImpl;


public class UserPreferenceCalculator {

	/*
	 * 根据用户调查进行用户调查计算
	 */
	public void CalcuPrimaryUp(UserSurver user_surver, UserSurverResult usr){
		usr.setStylePreference1(user_surver.getStylePreference1());
		usr.setStylePreference2(user_surver.getStylePreference2());
		usr.setStylePreference3(user_surver.getStylePreference3());
    	
    	int age_level = user_surver.getAgeLevel();
    	int income_level = user_surver.getFamilyIncomeLevel();
    	int invest_taget = user_surver.getInvestTargetLevel();
    	int loss_level = user_surver.getLossLevel();
    	//for cash flow 
    	if (income_level == 1 && (age_level > 1 && age_level <= 4)){
    		usr.setCashFlowPreference(2);
    	}
    	else if (income_level == 2 || income_level == 3){
    		usr.setCashFlowPreference( 1);
    	}
    	else if (age_level == 1 || income_level == 1){
    		usr.setCashFlowPreference(1);
    	}
    	//for risk tolerance
    	switch (loss_level){
    	case 1:
    	{
    		switch (age_level){
    		case 1:
    			usr.setRiskTolerance(1);
    			break;
    		case 2:
    			usr.setRiskTolerance(2);
    			break;
    		case 3:
    			usr.setRiskTolerance(3);
    			break;
    		case 4:
    		case 5:
    			usr.setRiskTolerance(4);
    			break;
    		default:
    			usr.setRiskTolerance(1);
    			break;
    		}
    		break;
    	}
    	case 2:
    	{
    		switch (age_level){
    		case 1:
    			usr.setRiskTolerance(5);
    			break;
    		case 2:
    			usr.setRiskTolerance(6);
    			break;
    		case 3:
    			usr.setRiskTolerance(7);
    			break;
    		case 4:
    		case 5:
    			usr.setRiskTolerance(8);
    			break;
    		default:
    			usr.setRiskTolerance(5);
    			break;
    		}
    		break;
    	}
    	case 3:
    	{
    		switch (age_level){
    		case 1:
    			usr.setRiskTolerance(9);
    			break;
    		case 2:
    			usr.setRiskTolerance(10);
    			break;
    		case 3:
    			usr.setRiskTolerance(11);
    			break;
    		case 4:
    		case 5:
    			usr.setRiskTolerance(12);
    			break;
    		default:
    			usr.setRiskTolerance(9);
    			break;
    		}
    		break;
    	}
    	default :
    		usr.setRiskTolerance(1);
    		break;
    	}
    	
    	//for risk control 
    	switch (loss_level){
    	case 1:
    	{
    		if (invest_taget >=1 && invest_taget <= 3){
    			usr.setRiskControlPreference(1);
    		}
    	    break;
    	}
    	case 2:
    	{
    		if (invest_taget >=1 && invest_taget <= 3){
    			usr.setRiskControlPreference(2);
    		}
    		break;
    	}
    	case 3:
    	{
    		if (invest_taget >=1 && invest_taget <= 3){
    			usr.setRiskControlPreference(3);
    		}
    		break;
    	}
    	default:
    		usr.setRiskControlPreference(1);
    		break;
    	}
    	
        usr.setUserId(user_surver.getUserId());
        usr.setSurverDate(user_surver.getSurverDate());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        usr.setInsertedDate(df.format(new Date()));
	}

	/*
	 * 根据用户问卷调查计算出来的结果，计算用户偏好，并对用户偏好进行分类
	 */
	public void CalcuFinalUp(UserSurverResult usr, UserPreference up, UserPreferenceClassification upc){
		up.setUserId(usr.getUserId());
		up.setStylePreference1(usr.getStylePreference1());
		up.setStylePreference2(usr.getStylePreference2());
		up.setStylePreference3(usr.getStylePreference3());
		
		int cash_flow_preference = usr.getCashFlowPreference();
		int risk_tolerance = usr.getRiskTolerance();
		int rist_control_preference = usr.getRiskControlPreference();
		
		//for cash flow preference
		up.setCashFlowPreference(cash_flow_preference);
		
		//for rish preference
		if ((risk_tolerance >= 1 && risk_tolerance <= 4) && 
				(rist_control_preference >= 1 && rist_control_preference <= 3)){
			up.setRiskPreference(1);
		}
		else if ((risk_tolerance >= 5 && risk_tolerance <= 8) && 
				(rist_control_preference >= 1 && rist_control_preference <= 3)){
			up.setRiskPreference(2);
		}
		else if ((risk_tolerance >= 9 && risk_tolerance <= 12) && 
				(rist_control_preference >= 1 && rist_control_preference <= 3)){
			up.setRiskPreference(3);
		}
		else{
			up.setRiskPreference(1);
		}
		
		int final_cash_flow_preference = up.getCashFlowPreference();
		int final_risk_preference = up.getRiskPreference();
		
		//需要优化。。。
		EntityDao<UserTypeDefinition> dao = new UserTypeDefinitionDaoImpl();
		List list = dao.findAll();
		int user_type = 0;
		for (Iterator iter = list.iterator(); iter.hasNext();){
			UserTypeDefinition utd = (UserTypeDefinition)iter.next();
			System.out.println(utd.getUser_Type_Id());
			System.out.println(utd.getCash_Flow_Preference_Type());
			System.out.println(utd.getRisk_Preference_Type());
			System.out.println(final_cash_flow_preference);
			System.out.println(final_risk_preference);
			System.out.println("------------------------------------");
			if (final_cash_flow_preference == utd.getCash_Flow_Preference_Type() 
					&& final_risk_preference == utd.getRisk_Preference_Type()){
				user_type = utd.getUser_Type_Id();
				
				break;
			}
		}
		
		// for user preference classification
		upc.setUserId(usr.getUserId());
		upc.setUserTypeId(user_type);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		upc.setTimeStamp(df.format(new Date()));
			
	}

	/*
	 * 
	 */
	public static void main(String[] args)  throws SQLException {
        UserSurver user_surver = new UserSurver();
        user_surver.setUserId("1234567890");
        user_surver.setAgeLevel(4);
        user_surver.setFamilyIncomeLevel(1);
        user_surver.setInvestTargetLevel(1);
        user_surver.setLossLevel(2);
        user_surver.setStylePreference1("互联网金融");
        user_surver.setSurverDate("2015-12-12 12:12:12");
        
        UserSurverResult usr = new UserSurverResult();
        UserPreferenceCalculator calcu = new UserPreferenceCalculator();
        calcu.CalcuPrimaryUp(user_surver, usr);
        
        EntityDao<UserSurverResult> dao = new UserSurverResultDaoImpl();
        //dao.update(usr);
        
        UserPreference up = new UserPreference();
        UserPreferenceClassification upc = new UserPreferenceClassification();
        calcu.CalcuFinalUp(usr, up, upc);
        
        EntityDao<UserPreference> dao1 = new UserPreferenceDaoImpl();
        //dao1.add(up);
        EntityDao<UserPreferenceClassification> dao2 = new UserPreferenceClassificationDaoImpl();
        dao2.add(upc);
       
        
        
        
	}
}

/*
public class UserPreferenceCalculator {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        int i = 5;
        operate(a, b, i);
        System.out.println(a + "," + b + "," + i);
    }
    public static void operate(StringBuffer x, StringBuffer y, int j) {
        y.append(x);
    	x.append(y);
        y = x;
        y.append("C");
        j = 1;
        
    }
}
*/

