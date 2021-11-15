package com.j2se.zuoye;
//Ö÷ÈËÀà
public class Master {	
	public void cure(Pet penguin){
		if(penguin.getHealth() < 60){
			penguin.toHospital();
		}
	}
}
