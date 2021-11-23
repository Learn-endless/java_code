package com.bit.testdemo1;
//自定义年龄异常
public class AgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(String age){
		super(age);
	}
}
