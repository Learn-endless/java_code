package com.myproject;

public class TestDemo01 {
	//1.打印1-100之间的素数
	public static void main(String[] args) {
		System.out.println("1-100之间的素数有：");
		for(int i = 1; i <= 100; i++) {
			boolean flag = true;
			for(int j = 2;j <= Math.sqrt(i);j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i+" ");
			}
		}
	}
}
