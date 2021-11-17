package com.zretc.bookshop.entity;
//用户实体类
public class UserEntity {
	//用户编号,唯一
	private int userId;
	//用户名
	private String userName;
	//密码
	private String userPwd;
	//构造方法
	public UserEntity() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public UserEntity(int userId, String userName, String userPwd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}
	//公共的get和set方法
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	//重写toString方法
	@Override
	public String toString() {
		return "UserEntity [ID=" + userId + ", 用户名=" + userName + ", 密码=" + userPwd + "]";
	}
	
}
