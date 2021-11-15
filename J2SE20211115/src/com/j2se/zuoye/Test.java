package com.j2se.zuoye;
public class Test {

	public static void main(String[] args) {
		java.sql.Date data = new java.sql.Date(0);
		
		Dog dog = new Dog("大黄",55,85,"中华田园犬");
		Penguin penguin = new Penguin("小企鹅",30,99,"雄");
		
		Master m = new Master();
		
		m.cure(dog);
		
		m.cure(penguin);
	}

}
