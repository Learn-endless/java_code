package com.j2se.text;

public class Teacher extends Person{
	private String ID;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, char sex,String ID) {
		super(name,age,sex);
		this.ID = ID;
	}

	@Override
	public void print() {
		System.out.println("������"+this.getName());
		System.out.println("���䣺"+this.getAge());
		System.out.println("�Ա�"+this.getSex());
		System.out.println("���ţ�"+this.ID);
	}
	
	
}
