package com.myproject;

import java.util.Scanner;

public class TestDemo05 {
	//5.��ѡ��������һ��N*N��ά���飬�Ӽ����������ά�����ֵ�����ҳ�ÿ�������ֵ���һ��һά���鲢��ӡ�ڿ���̨��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[50][50];
		System.out.print("������n��ֵ:");
		int n = sc.nextInt();
		
		System.out.println("��������Ԫ�أ�");
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
