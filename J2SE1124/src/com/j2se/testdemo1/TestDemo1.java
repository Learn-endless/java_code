package com.j2se.testdemo1;

import java.math.BigDecimal;
import java.math.BigInteger;

//Math中的常用静态方法
public class TestDemo1 {
	/**
	 * BigInteger的使用
	 */
	public static void BigInterger() {
		long n = 999999999;
		
		//BigInteger中的加减乘除方法
		BigInteger bit1 = new BigInteger("99999999999999999");
		BigInteger bit2 = new BigInteger("88888888888888888");
		System.out.println(bit1.add(bit2));
		System.out.println(bit1.subtract(bit2));
		System.out.println(bit1.multiply(bit2));
		System.out.println(bit1.divide(bit2));
	}

	/**
	 * Math静态工具类中的方法
	 */
	public static void Math() {
		// TODO 自动生成的方法存根
		double n = 3.14;
		//Math.ceil()向上取整
		System.out.println(Math.ceil(n));
		
		//Math.floor()向下取整
		int num = (int)(Math.floor(n));
		System.out.println(num);
		
		//Math.round():四舍五入,return int
		System.out.println(Math.round(3.14));
		
		//Math.random()随机数,默认范围：[0,1)
		System.out.println((int)(Math.floor(Math.random()*100)));
		int i = 0;
		while(i++ < 100) {
          //随机[10,20]
			System.out.println((int)(Math.ceil(Math.random()*10+10)));
		}
		//abs():绝对值
		System.out.println(Math.abs(-8));
		
		//pow():幂运算
		System.out.println(Math.pow(2, 4));
	}
	
	/**
	 * BigDecimal用于计算小数时取到更多的小数位，从而达到更高的精度
	 */
	public static void BigDecimalTest() {
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println(d1 - d2);
		//BigDecimal中的加减乘除
		BigDecimal dd1 = new BigDecimal(d1);
		BigDecimal dd2 = new BigDecimal(d2);
		
		System.out.println(dd1.add(dd2));
		System.out.println(dd1.subtract(dd2));
		System.out.println(dd1.multiply(dd2));
		System.out.println(dd1.divide(dd2));
	}
	
	public static void main(String[] args) {
		
	}
}
