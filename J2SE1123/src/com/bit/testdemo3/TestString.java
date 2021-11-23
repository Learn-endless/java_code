package com.bit.testdemo3;

public class TestString {
	public static void main(String[] args){
		String s1 = "hello world!";
		System.out.println(s1);
		
		//将一个字符串转化为大写字母(本身的字符串对象没有被改变，只是重新创建了一个对象)
		System.out.println(s1.toUpperCase());
		
		//将一个字符串截取一部分
		System.out.println(s1.substring(0, 5));
		
		//返回字符串中字符ch第一次出现的位置的索引值
		System.out.println(s1.indexOf('h'));
		
		//返回从fromindex索引
		System.out.println(s1.toUpperCase());
	}
}
