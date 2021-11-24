package com.j2se.task;

import java.time.LocalTime;
import java.util.Date;

public class TestTask2 {

	public static void main(String[] args) {
		//测试将Date类型的日期转换成String
		Date date = new Date();
		String str = Task2.DateConStr(date);
		System.out.println(str);
		//测试将String类型转换成Date类型的日期
		Date date1 = Task2.StrConDate("1999-09-27 12:30:30");
		String str1 = Task2.DateConStr(date1);
		System.out.println(str1);
		//测试添加一年
		Date date2 = Task2.AddOneYear("2000-10-28 13:31:35");
		String str2 = Task2.DateConStr(date2);
		System.out.println(str2);
		//测试添加一月
		Date date3 = Task2.AddOneMonth("2001-11-29 14:32:40");
		String str3 = Task2.DateConStr(date3);
		System.out.println(str3);
		//添加一天
		Date date4 = Task2.AddOneDay("2002-12-30 15:33:45");
		String str4 = Task2.DateConStr(date4);
		System.out.println(str4);
	}

}
