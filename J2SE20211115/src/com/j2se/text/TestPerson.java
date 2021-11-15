package com.j2se.text;

public class TestPerson {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("王娟",20,'女',"123456");
		teacher.print();
		System.out.println("================================");
		
		Student student = new Student("小明",15,'男',"123456","软工z1");
		student.print();
		System.out.println("================================");
		
		Person[] ret = {student,teacher};
		for(Person x:ret){
			x.print();
			System.out.println("================================");
		}
	}
}
