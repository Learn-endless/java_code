package com.myproject;

import java.util.Scanner;

public class TestDemo03 {
	//3.�ӿ���̨�����ſεĳɼ�¼�뵽�����У������߷֣���ͷֺ�ƽ����
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
		System.out.println("��߷�Ϊ��"+max+"��ͷ�Ϊ��"+min+",ƽ����Ϊ��"+(sum/5.0));
	}

}
