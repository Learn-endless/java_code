package com.j2se.task;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

//���ڸ�ʽת��������
public class Task2 {
	
	//Dateת��ΪString
	public static String DateConStr(Date date) {
		SimpleDateFormat s = new SimpleDateFormat("YYYY��-MM��-dd�� HHʱ:mm��:ss��");
		String str = s.format(date);
		return str;
	}
	//Stringת��ΪDate
	public static Date StrConDate(String str) {
		Date date = null;
		DateFormat df3 = DateFormat.getDateTimeInstance();
		try {
			date = df3.parse(str);
		} catch (ParseException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return date;
	}
	//���һ��
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
	//���һ��
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
	//���һ��
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
