package com.j2se.test;

public class Pet {
	public String name;
	public int age;
	public char sex;
	
	
	
	public Pet(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void test(){
		System.out.println("父类中使用");
	}

}
