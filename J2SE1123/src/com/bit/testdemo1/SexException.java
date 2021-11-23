package com.bit.testdemo1;
//自定义判断性别异常
public class SexException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SexException(String age){
		super(age);
	}
}
