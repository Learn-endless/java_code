package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.UserEntity;

//�û�����ʼ��ʵ���������
public class BaseDao {
	//������õ��û�����
	 protected static UserEntity[] users = new UserEntity[3];
	//��ʼ���û�����
	static {
		UserEntity user1 = new UserEntity(1,"Tom","123");
		UserEntity user2 = new UserEntity(2,"jack","456");
		UserEntity user3 = new UserEntity(3,"rose","789");
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
	}
	//�ṩ��һ����ȡ���ж�������Ĺ��еķ���
	public UserEntity[] getUsers() {
		return users;
	}
}
