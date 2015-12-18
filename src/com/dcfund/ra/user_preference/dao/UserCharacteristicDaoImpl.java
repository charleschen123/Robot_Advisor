package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.entity.UserCharacteristic;

public class UserCharacteristicDaoImpl implements EntityDao<UserCharacteristic> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserCharacteristicDaoImpl(){
		runner = new QueryRunner();
	}
	
	@Override
	public void add(UserCharacteristic u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Characteristic (User_Id, Liquid_Wealth, Location, Source," +
				"Update_Date, Inserted_Date) values (?, ?, ?, ?, ?, ?)";
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getUserId(), u.getLiquidWealth(), u.getLocation(), u.getSource(),
					u.getUpdateDate(), u.getInsertedDate());
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
	public List<UserCharacteristic> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserCharacteristic findByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserCharacteristic u) {
		// TODO Auto-generated method stub
		
	}
    
}
