package com.j2se.text;

public class Student extends Person{
	private String ID;
	private String Class;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student( String name, int age, char sex,String ID,String Class) {
		super(name,age,sex);
		this.ID = ID;
		this.Class = Class;
	}

	@Override
	public void print() {
		System.out.println("������"+this.getName());
		System.out.println("���䣺"+this.getAge());
		System.out.println("�Ա�"+this.getSex());
		System.out.println("ID��"+this.ID);
		System.out.println("�༶��"+this.Class);
	}
	
	
	
}
