package com.zretc.bookshop.dao;

import com.zretc.bookshop.entity.UserEntity;

//���ݷ��ʲ����û���صĽ��
public interface UserDao {
	//��¼
	public abstract UserEntity login(String userName,String userPwd);
	//�޸�����
	public abstract boolean updatePwd(UserEntity user,String newPwd1,String newPwd2);
	//�û�ע��
	public boolean userRegister(String name,String pwd);
}
