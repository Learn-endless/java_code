package com.j2se.test;

public class TestPet {

	public static void main(String[] args) {
		Dog dog = new Dog("´ó»Æ",20,'ÐÛ');
		dog.test();
	
		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.sex);
	}

}
