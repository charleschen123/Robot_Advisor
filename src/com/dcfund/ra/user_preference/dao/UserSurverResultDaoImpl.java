package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.dao.EntityDao;
import com.dcfund.ra.user_preference.entity.UserSurverResult;



public class UserSurverResultDaoImpl implements EntityDao<UserSurverResult> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserSurverResultDaoImpl(){
		runner = new QueryRunner();
	}

	
	@Override
	public void add(UserSurverResult u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Surver_Result(User_Id, Surver_Date, Cash_Flow_Preference," +
				"Risk_Tolerance, Risk_Control_Preference,  Style_Preference_1, Style_Preference_2," +
				"Style_Preference_3, Inserted_Date) values(?, ?, ?,?,?,?,?,?,?)";
		try {
			runner.update(DBUtils.getConnection(), sql, u.getUserId(), u.getSurverDate(), u.getCashFlowPreference(),
					u.getRiskTolerance(), u.getRiskControlPreference(), u.getStylePreference1(), u.getStylePreference2(),
					u.getStylePreference3(), u.getInsertedDate());
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
	public List<UserSurverResult> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserSurverResult findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserSurverResult u) {
		// TODO Auto-generated method stub
		String sql = "update UP_User_Surver_Result set Surver_Date = ?, Cash_Flow_Preference = ?," +
			"Risk_Tolerance = ?, Risk_Control_Preference = ?,  Style_Preference_1 = ?, Style_Preference_2 = ?," +
			"Style_Preference_3 = ?, Inserted_Date = ? ,User_Id = ?";
        try {
			runner.update(DBUtils.getConnection(), sql,  u.getSurverDate(), u.getCashFlowPreference(),
					u.getRiskTolerance(), u.getRiskControlPreference(), u.getStylePreference1(), u.getStylePreference2(),
					u.getStylePreference3(), u.getInsertedDate(), u.getUserId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}