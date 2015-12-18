package com.dcfund.ra.user_preference.dao;


import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.entity.UserPreference;

public class UserPreferenceDaoImpl implements EntityDao<UserPreference> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserPreferenceDaoImpl(){
		runner = new QueryRunner();
	}
	
	
	@Override
	public void add(UserPreference u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Preference (User_Id, Cash_Flow_Preference, Risk_Preference," +
				"Style_Preference_1, Style_Preference_2, Style_Preference_3) values (?, ?, ?, ?, ?, ?)";
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getUserId(), u.getCashFlowPreference(),
					u.getRiskPreference(), u.getStylePreference1(), u.getStylePreference2(), u.getStylePreference3());
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
	public List<UserPreference> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPreference findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserPreference u) {
		// TODO Auto-generated method stub
		
	}

}
