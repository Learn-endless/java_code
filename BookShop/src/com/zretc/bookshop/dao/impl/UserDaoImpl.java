package com.zretc.bookshop.dao.impl;

import java.util.Arrays;

import com.zretc.bookshop.dao.BaseDao;
import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.entity.UserEntity;

public class UserDaoImpl extends BaseDao implements UserDao {
	//用户登录
	@Override
	public UserEntity login(String userName, String userPwd) {
		// TODO 自动生成的方法存根
		UserEntity[] temp = super.getUsers();
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == null) {
				continue;
			}
			if(temp[i].getUserName().equals(userName)&&temp[i].getUserPwd().equals(userPwd)) {
				return temp[i];
			}
		}
		return null;
	}
	//用户修改密码
	@Override
	public boolean updatePwd(UserEntity user, String newPwd1, String newPwd2) {
		// TODO 自动生成的方法存根
		if(newPwd1.equals(newPwd2)) {
			return false;
		}
		
		UserEntity[] temp = super.getUsers();
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == null) {
				continue;
			}
			if(temp[i].getUserId() == user.getUserId()) {
				temp[i].setUserPwd(newPwd2);
				return true;
			}
		}
		return false;
	}
	
	//用户注册
	public boolean userRegister(String name,String pwd) {
		UserEntity[] temp = super.getUsers();
		int count = 0;
		for(int i = 0; i < temp.length; i++) {
			count++;
		}
		if(count == temp.length) {
			BaseDao.users = Arrays.copyOf(temp, temp.length*2);
			temp = super.getUsers();
		}
		
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == null) {
				temp[i] = new UserEntity(i+1,name,pwd);
				return true;
			}
		}
		return false;
	}
}
