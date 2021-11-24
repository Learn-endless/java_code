package com.j2se.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//随机生成订单编号(5位随机数和当前时间)
public class Task1 {
	public static String RandomOrder() {
		Random random = new Random();
		Date date = new Date();
		long a = random.nextInt(90000)+10000;
		SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd-HH-mm-ss");
		String sum = s.format(date);
		return a+"-"+sum;
	}
	
	public static void main(String[]args) {
		String order = RandomOrder();
		System.out.println(order);
	}
}
