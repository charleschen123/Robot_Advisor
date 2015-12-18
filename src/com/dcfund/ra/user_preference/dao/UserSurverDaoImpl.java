package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.entity.UserSurver;

public class UserSurverDaoImpl implements EntityDao<UserSurver> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserSurverDaoImpl(){
		runner = new QueryRunner();
	}
	
	@Override
	public void add(UserSurver u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Surver (User_Id, Surver_Date, Family_Income_Level, " +
				"Age_Level, Invest_Target_Level, Loss_Level, Style_Preference_1, Style_Preference_2," +
				"Style_Preference_3) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getUserId(), u.getSurverDate(), u.getFamilyIncomeLevel(), 
					u.getAgeLevel(), u.getInvestTargetLevel(), u.getLossLevel(), u.getStylePreference1(), u.getStylePreference2(),
					u.getStylePreference3());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserSurver> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserSurver findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserSurver u) {
		// TODO Auto-generated method stub
		
	}

}
