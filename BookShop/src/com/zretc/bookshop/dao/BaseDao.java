package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.UserEntity;

//用户来初始化实体类的数据
public class BaseDao {
	//存放所用的用户对象
	 protected static UserEntity[] users = new UserEntity[3];
	//初始化用户对象
	static {
		UserEntity user1 = new UserEntity(1,"Tom","123");
		UserEntity user2 = new UserEntity(2,"jack","456");
		UserEntity user3 = new UserEntity(3,"rose","789");
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
	}
	//提供了一个获取所有对象数组的共有的方法
	public UserEntity[] getUsers() {
		return users;
	}
}
