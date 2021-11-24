package com.j2se.task;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

//日期格式转换工具类
public class Task2 {
	
	//Date转换为String
	public static String DateConStr(Date date) {
		SimpleDateFormat s = new SimpleDateFormat("YYYY年-MM月-dd日 HH时:mm分:ss秒");
		String str = s.format(date);
		return str;
	}
	//String转换为Date
	public static Date StrConDate(String str) {
		Date date = null;
		DateFormat df3 = DateFormat.getDateTimeInstance();
		try {
			date = df3.parse(str);
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return date;
	}
	//添加一年
	public static Date AddOneYear(String str) {
		String[] ret = str.split("-");
		int num = Integer.parseInt(ret[0])+1;
		String s = num+"-";
		for(int i = 1; i < ret.length; i++) {
			s += ret[i];
			if(i == 1) {
				s +="-";
			}else if(i == 2) {
				s +=" ";
			}else if(i != 5) {
				s +=":";
			}
		}
		return StrConDate(s);
	}
	//添加一月
	public static Date AddOneMonth(String str) {
		String[] ret = str.split("-");
		int num = Integer.parseInt(ret[1])+1;
		String s = ret[0]+"-"+num+"-";
		for(int i = 2; i < ret.length; i++) {
			s += ret[i];
			if(i == 2) {
				s +=" ";
			}else if(i != 5) {
				s +=":";
			}
		}
		return StrConDate(s);
	}
	//添加一天
	public static Date AddOneDay(String str) {
		String[] ret = str.split(" ");
		String[] temp = ret[0].split("-");
		int num = Integer.parseInt(temp[2])+1;
		String s = temp[0]+"-"+temp[1]+"-"+num+" ";
		for(int i = 1;i < ret.length;i++) {
			s += ret[i];
		}
		return StrConDate(s);
	}
}
