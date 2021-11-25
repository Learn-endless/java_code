package com.j2se.test;

public class Cat extends Pet{

	public Cat(String name, int age, char sex) {
		super(name, age, sex);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Cat子类中使用");
	}
	
}
