package com.zretc.bookshop.entity;
//�û�ʵ����
public class UserEntity {
	//�û����,Ψһ
	private int userId;
	//�û���
	private String userName;
	//����
	private String userPwd;
	//���췽��
	public UserEntity() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	public UserEntity(int userId, String userName, String userPwd) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}
	//������get��set����
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

	//��дtoString����
	@Override
	public String toString() {
		return "UserEntity [ID=" + userId + ", �û���=" + userName + ", ����=" + userPwd + "]";
	}
	
}
