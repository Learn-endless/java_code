package com.j2se.text;

public class TestPerson {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("����",20,'Ů',"123456");
		teacher.print();
		System.out.println("================================");
		
		Student student = new Student("С��",15,'��',"123456","��z1");
		student.print();
		System.out.println("================================");
		
		Person[] ret = {student,teacher};
		for(Person x:ret){
			x.print();
			System.out.println("================================");
		}
	}
}
