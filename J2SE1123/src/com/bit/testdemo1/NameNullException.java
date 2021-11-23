package com.bit.testdemo1;
//自定义异常类，姓名不能为空
//1.继承Exception类
//2.调用父类的方法
public class NameNullException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NameNullException(String str){
		super(str);
	}
}
