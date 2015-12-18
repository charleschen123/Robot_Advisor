package com.dcfund.ra.user_preference.dao;

import java.util.List;


/**
 * 对象操作数据库接口，使用泛型，减少代码
 * 
 * @author wangming 20151216
 * 
 */

public interface EntityDao<Entity> {
	// 添加方法
	public void add(Entity u) ;

	// 更新方法
	public void update(Entity u) ;

	// 删除方法
	public void delete(String user_id) ;

	// 查找方法
	public Entity findByUserId(String user_id) ;

	// 查找所有
	public List<Entity> findAll() ;
}