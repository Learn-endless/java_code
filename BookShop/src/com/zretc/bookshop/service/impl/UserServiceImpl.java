package com.zretc.bookshop.service.impl;

import com.zretc.bookshop.dao.UserDao;
import com.zretc.bookshop.dao.impl.UserDaoImpl;
import com.zretc.bookshop.entity.UserEntity;
import com.zretc.bookshop.service.UserService;

public class UserServiceImpl implements UserService{
	UserDao userdao = new UserDaoImpl();
	@Override
	public UserEntity login(String userName, String userPwd) {
		// TODO �Զ����ɵķ������
		return userdao.login(userName, userPwd);
	}

	@Override
	public boolean updatePwd(UserEntity user, String newPwd1, String newPwd2) {
		// TODO �Զ����ɵķ������
		return userdao.updatePwd(user, newPwd1, newPwd2);
	}

	@Override
	public boolean userRegister(String name, String pwd) {
		// TODO �Զ����ɵķ������
		return userdao.userRegister(name, pwd);
	}

}
