package com.bit.testdemo2;

public class Entity {
	public static void main(String[] args){
		EntityType n = EntityType.VIDEO;
		switch(n){
		case AUDIO:
			System.out.println("AUDIO");
			break;
		case VIDEO:
			System.out.println("VIDEO");
			break;
		case IMAGE:
			System.out.println("IMAGE");
			break;
		case TEXT:
			System.out.println("TEXT");
			break;
		default:
			System.out.println("heheh");
			break;
			
		}
	}	
}
