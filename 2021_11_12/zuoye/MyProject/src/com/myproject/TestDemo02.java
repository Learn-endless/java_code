package com.myproject;

public class TestDemo02 {
    //2.小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱
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
		System.out.println("小芳第"+count+"天可以存到"+money+"元");
	}

}
