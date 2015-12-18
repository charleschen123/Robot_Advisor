package com.dcfund.ra.user_preference.dao;

import java.util.List;


/**
 * ����������ݿ�ӿڣ�ʹ�÷��ͣ����ٴ���
 * 
 * @author wangming 20151216
 * 
 */

public interface EntityDao<Entity> {
	// ��ӷ���
	public void add(Entity u) ;

	// ���·���
	public void update(Entity u) ;

	// ɾ������
	public void delete(String user_id) ;

	// ���ҷ���
	public Entity findByUserId(String user_id) ;

	// ��������
	public List<Entity> findAll() ;
}