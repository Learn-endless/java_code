package com.j2se.testdemo2;
/**
 * <T,E,K,V>
 * T:java��
 * E:JavaԪ��
 * K:��
 * V:��
 */
public class ObjectTest2 implements Box<Character>{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ObjectTest2 a = new ObjectTest2();
		a.print('A');
	}

	@Override
	public void print(Character n) {
		// TODO �Զ����ɵķ������
		System.out.println("n = "+n);
	}

}
