package com.j2se.zuoye;

public class Dog extends Pet{
	private String strain;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
		
	public void toHospital(){
		System.out.println("小狗正在治疗....");
		super.setHealth(100);
	}
	
	
}
