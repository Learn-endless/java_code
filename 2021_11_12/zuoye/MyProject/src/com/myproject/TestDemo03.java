package com.myproject;

import java.util.Scanner;

public class TestDemo03 {
	//3.从控制台将五门课的成绩录入到数组中，求出最高分，最低分和平均分
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] data = new float[5];
		float sum = 0.0F;
		for(int i = 0;i<data.length;i++) {
			data[i] = sc.nextFloat();
			sum+=data[i];
		}
		float max = data[0];
		float min = data[0];
		for(int i = 0; i < data.length;i++) {
			if(max < data[i]) {
				max = data[i];
			}
			if(min > data[i]) {
				min = data[i];
			}
		}
		System.out.println("最高分为："+max+"最低分为："+min+",平均分为："+(sum/5.0));
	}

}
