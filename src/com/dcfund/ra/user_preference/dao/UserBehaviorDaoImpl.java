package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.entity.UserBehavior;

public class UserBehaviorDaoImpl implements EntityDao<UserBehavior> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserBehaviorDaoImpl(){
		runner = new QueryRunner();
	}
	
	
	@Override
	public void add(UserBehavior u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Behavior (User_Id, Time_Stamp, User_Behavior_Type, " +
				"Behavior_Value, Behavior_Target, Behavior_Reference) values (?, ?, ?, ?, ?, ?)";
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getUserId(), u.getTimeStamp(), u.getUserBehaviorType(),
					u.getBehaviorValue(), u.getBehaviorTarget(), u.getBehaviorReference());
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
	public List<UserBehavior> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserBehavior findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserBehavior u) {
		// TODO Auto-generated method stub
		
	}
	
}