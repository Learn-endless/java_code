package com.myproject;

public class TestDemo04 {
	//4.用数组求出斐波那契数列的前10项值（斐波那契数列：1,1,2,3,5,8,,）
	public static void main(String[] args) {
		int[] arr = {1,1,0,0,0,0,0,0,0,0};
		int a = 1;
		int b = 1;
		int c = 0;
		for(int i = 2; i <arr.length;i++) {
			c = a + b;
			arr[i] = c;
			a = b;
			b = c;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
