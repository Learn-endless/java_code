package com.myproject;

public class TestDemo02 {
    //2.С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ
	public static void main(String[] args) {
		int count = 1;
		float money = 2.5F;
		while((int)(money) <= 100) {
			money+=2.5;
			if(count%5==0) {
				money-=6;
			}
			count++;
		}
		System.out.println("С����"+count+"����Դ浽"+money+"Ԫ");
	}

}
