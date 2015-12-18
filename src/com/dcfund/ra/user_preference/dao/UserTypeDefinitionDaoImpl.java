package com.dcfund.ra.user_preference.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.dcfund.common.db.DBUtils;
import com.dcfund.ra.user_preference.dao.*;
import com.dcfund.ra.user_preference.entity.*;

public class UserTypeDefinitionDaoImpl implements EntityDao<UserTypeDefinition> {

	private QueryRunner runner = null;//²éÑ¯ÔËÐÐÆ÷
	public UserTypeDefinitionDaoImpl(){
		runner = new QueryRunner();
	}
	
	@Override
	public void add(UserTypeDefinition u) {
		// TODO Auto-generated method stub
		String sql = "insert into UP_User_Type_Definition (User_Type_Id, Cash_Flow_Preference_Type, " +
				"Risk_Preference_Type) values (?, ?, ?)";
		
		try {
			this.runner.update(DBUtils.getConnection(), sql, u.getUser_Type_Id(), u.getCash_Flow_Preference_Type(), 
					u.getRisk_Preference_Type());
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
	public List<UserTypeDefinition> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from UP_User_Type_Definition";
		
		List<UserTypeDefinition> list = new ArrayList<UserTypeDefinition>();
		try {
			list = (List<UserTypeDefinition>) this.runner.query(DBUtils.getConnection(), sql, new BeanListHandler<UserTypeDefinition>(UserTypeDefinition.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserTypeDefinition utd = (UserTypeDefinition)list.get(0);
		System.out.println(utd.getUser_Type_Id());
		return list;
	}

	@Override
	public UserTypeDefinition findByUserId(String userId)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserTypeDefinition u)  {
		// TODO Auto-generated method stub
		
	}
	
}