package com.j2se.zuoye;
public class Test {

	public static void main(String[] args) {
		java.sql.Date data = new java.sql.Date(0);
		
		Dog dog = new Dog("���",55,85,"�л���԰Ȯ");
		Penguin penguin = new Penguin("С���",30,99,"��");
		
		Master m = new Master();
		
		m.cure(dog);
		
		m.cure(penguin);
	}

}
