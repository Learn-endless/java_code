package com.j2se.test;

public class Dog extends Pet{
	
	public Dog(String name, int age, char sex){
		super(name,age,sex);
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Dog子类中使用");
	}
	
}
