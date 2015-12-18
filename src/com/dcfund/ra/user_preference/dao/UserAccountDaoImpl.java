package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import com.dcfund.common.db.DBUtils;

import com.dcfund.ra.user_preference.entity.*;


public class UserAccountDaoImpl implements EntityDao<UserAccount> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserAccountDaoImpl(){
		runner = new QueryRunner();
	}
	
	@Override
	public void add(UserAccount u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Account(User_Id,  User_Name, Name, Birthday, Gender," +
				"Account_Status, Account_Date, Inserted_Date) values (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getUserId(), u.getUserName(), u.getName(),
					u.getBirthday(), u.getGender(), u.getAccountStatus(), u.getAccountDate(), u.getInsertedDate());
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
	public List<UserAccount> findAll()  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAccount findByUserId(String userId)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserAccount u)  {
		// TODO Auto-generated method stub
		
	}

}
