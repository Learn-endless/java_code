package com.j2se.testdemo1;

import java.math.BigDecimal;
import java.math.BigInteger;

//Math�еĳ��þ�̬����
public class TestDemo1 {
	/**
	 * BigInteger��ʹ��
	 */
	public static void BigInterger() {
		long n = 999999999;
		
		//BigInteger�еļӼ��˳�����
		BigInteger bit1 = new BigInteger("99999999999999999");
		BigInteger bit2 = new BigInteger("88888888888888888");
		System.out.println(bit1.add(bit2));
		System.out.println(bit1.subtract(bit2));
		System.out.println(bit1.multiply(bit2));
		System.out.println(bit1.divide(bit2));
	}

	/**
	 * Math��̬�������еķ���
	 */
	public static void Math() {
		// TODO �Զ����ɵķ������
		double n = 3.14;
		//Math.ceil()����ȡ��
		System.out.println(Math.ceil(n));
		
		//Math.floor()����ȡ��
		int num = (int)(Math.floor(n));
		System.out.println(num);
		
		//Math.round():��������,return int
		System.out.println(Math.round(3.14));
		
		//Math.random()�����,Ĭ�Ϸ�Χ��[0,1)
		System.out.println((int)(Math.floor(Math.random()*100)));
		int i = 0;
		while(i++ < 100) {
          //���[10,20]
			System.out.println((int)(Math.ceil(Math.random()*10+10)));
		}
		//abs():����ֵ
		System.out.println(Math.abs(-8));
		
		//pow():������
		System.out.println(Math.pow(2, 4));
	}
	
	/**
	 * BigDecimal���ڼ���С��ʱȡ�������С��λ���Ӷ��ﵽ���ߵľ���
	 */
	public static void BigDecimalTest() {
		double d1 = 2.0;
		double d2 = 1.1;
		System.out.println(d1 - d2);
		//BigDecimal�еļӼ��˳�
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
