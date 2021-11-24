package com.j2se.testdemo2;
/**
 * <T,E,K,V>
 * T:java类
 * E:Java元素
 * K:键
 * V:对
 */
public class ObjectTest2 implements Box<Character>{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjectTest2 a = new ObjectTest2();
		a.print('A');
	}

	@Override
	public void print(Character n) {
		// TODO 自动生成的方法存根
		System.out.println("n = "+n);
	}

}
