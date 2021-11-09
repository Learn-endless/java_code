package com.myproject;

import java.util.Scanner;

public class TestDemo05 {
	//5.（选做）定义一个N*N二维数组，从键盘上输入二维数组的值，并找出每行中最大值组成一个一维数组并打印在控制台上
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[50][50];
		System.out.print("请输入n的值:");
		int n = sc.nextInt();
		
		System.out.println("输入数组元素：");
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] temp = new int[n];
		for(int i = 0; i < n;i++) {
			int max = arr[i][0];
			for(int j = 1; j < n;j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			temp[i] = max;
		}
		
		for(int x:temp) {
			System.out.print(x+" ");
		}
	}

}
