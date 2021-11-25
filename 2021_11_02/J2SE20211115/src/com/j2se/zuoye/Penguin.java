package com.j2se.zuoye;

public class Penguin extends Pet{
	private String sex;

	public Penguin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Penguin(String name, int health, int love,String sex) {
		super(name,health,love);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void toHospital(){
		System.out.println("企鹅正在治疗....");
		super.setHealth(100);
	}
}
