package com.j2se.zuoye;
//������
public class Master {	
	public void cure(Pet penguin){
		if(penguin.getHealth() < 60){
			penguin.toHospital();
		}
	}
}
