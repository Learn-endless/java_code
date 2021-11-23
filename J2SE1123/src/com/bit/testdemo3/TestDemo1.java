package com.bit.testdemo3;

import java.util.Scanner;

public class TestDemo1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = "aghagjaolfgasjg";
		while(sc.hasNext()){
			int count = 0;
			String ch = sc.next();
			char ret = ch.charAt(0);
			for(int i = 0; i < s1.length();i++){
				if(s1.charAt(i) == ret){
					count++;
				}
			}
			System.out.println(ch+"在"+s1+"中出现的次数为："+count+"次");
		}
	}
}
