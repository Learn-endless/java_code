package com.j2se.test1;

public class Test1{
	public static void main(String[] args) {
		Ticket t1 = new Ticket("D1234",118);
		Ticket t2 = new Ticket("D2345",120);
		Ticket t3 = new Ticket("D3456",138);
		Ticket t4 = new Ticket("D4567",140);
		Ticket t5 = new Ticket("D5678",158);
		Ticket t6 = new Ticket("D5678",158);
		Ticket t7 = new Ticket("D5678",158);
		
		User person = new User("Ð¡Ã÷","ÄÐ");
		Administ a = new Administ("ºÚ°×");
		
		Ticket[] temp = {t1,t2,t3,t4,t5,t6,t7};
		a.open(t1);
		a.close(t2);
		a.open(t3);
		a.close(t4);
		a.open(t5);
		a.open(t6);
		a.open(t7);
		person.setT(temp);
	}
}
