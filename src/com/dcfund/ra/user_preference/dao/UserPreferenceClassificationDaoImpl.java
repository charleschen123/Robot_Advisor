package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.entity.UserPreferenceClassification;

public class UserPreferenceClassificationDaoImpl implements EntityDao<UserPreferenceClassification> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserPreferenceClassificationDaoImpl(){
		runner = new QueryRunner();
	}
	
	@Override
	public void add(UserPreferenceClassification u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Preference_Classification (Time_Stamp, User_Id, User_Type_Id)" +
				" values (?, ?, ?)";
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getTimeStamp(), u.getUserId(), u.getUserTypeId());
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
	public List<UserPreferenceClassification> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from UP_User_Preference_Classification";
			
		List list = new ArrayList();
		try {
			list = (List) this.runner.query(DBUtils.getConnection(), sql, new BeanListHandler(UserPreferenceClassification.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public UserPreferenceClassification findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserPreferenceClassification u) {
		// TODO Auto-generated method stub
		
	}

	
}
