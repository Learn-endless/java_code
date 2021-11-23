package com.bit.testdemo1;
//自定义薪资异常
public class MoneyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoneyException (String str){
		super(str);
	}
}
