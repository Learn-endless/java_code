package com.bit.testdemo3;

public class TestString {
	public static void main(String[] args){
		String s1 = "hello world!";
		System.out.println(s1);
		
		//��һ���ַ���ת��Ϊ��д��ĸ(������ַ�������û�б��ı䣬ֻ�����´�����һ������)
		System.out.println(s1.toUpperCase());
		
		//��һ���ַ�����ȡһ����
		System.out.println(s1.substring(0, 5));
		
		//�����ַ������ַ�ch��һ�γ��ֵ�λ�õ�����ֵ
		System.out.println(s1.indexOf('h'));
		
		//���ش�fromindex����
		System.out.println(s1.toUpperCase());
	}
}
