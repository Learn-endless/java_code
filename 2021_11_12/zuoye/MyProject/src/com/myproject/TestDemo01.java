package com.myproject;

public class TestDemo01 {
	//1.��ӡ1-100֮�������
	public static void main(String[] args) {
		System.out.println("1-100֮��������У�");
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
