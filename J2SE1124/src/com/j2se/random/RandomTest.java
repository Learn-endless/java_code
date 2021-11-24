package com.j2se.random;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
//		//Random在创建对象时，可以设置随机种子
//		Random d = new Random(1);
//		
//		Random r = new Random();
//		//产生int类型的随机整数
//		System.out.println(r.nextInt());
//		//nextInt方法的参数中可以自定义范围
//		System.out.println(r.nextInt(21));
//		//产生long类型的随机整数
//		System.out.println(r.nextLong());
//		//产生double类型的随机整数
//		System.out.println(r.nextDouble());
//		//nextFloat方法的参数中可以自定义范围
//		System.out.println(r.nextFloat());
//		int count = 0;
//		while(count++ < 50) {
//			JiaoYanMa();
//		}
//		
//		UUIDTest();
//		DateTest1();
//		DateFormatTest1();
//		SimpleDateFormatTest();
//		CalendarTest();
//		LocalDateTest();
		LocalTimeTest();
	}
	//LocalTime表示时间
	public static void LocalTimeTest() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalTime lt1 = LocalTime.of(14, 35, 50);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("14:35:50.785");
		System.out.println(lt2);
	}
	//LocalDate表示日期的类（年月日）
	public static void LocalDateTest() {
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(1999, 12, 25);
		System.out.println(ld1);
		LocalDate ld2 = LocalDate.parse("2000-02-05");
		System.out.println(ld2);
	}
	//Calendar日历类，抽象类
	public static void CalendarTest() {
		Date d = new Date();
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"),Locale.CHINA);
		cal.add(Calendar.YEAR,1);
		cal.set(Calendar.MONTH,11);
		cal.set(Calendar.DATE,24);
		cal.set(1999, 11, 20, 14, 35, 45);  //月份是从0开始
		Date date = cal.getTime();
		SimpleDateFormat s = new SimpleDateFormat("YYYY年-MM月-dd日 HH时:mm分:ss秒");

		System.out.println(s.format(date));
		System.out.println(cal.get(Calendar.YEAR));
		
	}
	//SimpleDateFormat抽象类
	public static void SimpleDateFormatTest() {
		Date date = new Date();                 //D:年的天数      H:24小时制   h:12小时制   S:毫秒
		SimpleDateFormat s = new SimpleDateFormat("YYYY年-MM月-dd日 HH时:mm分:ss秒");
		
		System.out.println(s.format(date));
	}
	//DateFormat抽象类
	public static void DateFormatTest1() {
		Date date = new Date();
		/**
		 * getDateInstance():
		 * 		FULL :2021年11月24日 星期三
		 * 		LONG :2021年11月24日
		 * 		MEDIUM:2021-11-24(默认情况和不加参数)
		 * 		SHORT:21-11-24
		 * getTimeInstance():
		 * 		FULL:下午02时06分30秒 CST
		 * 		LONG:下午02时12分21秒
		 * 		MEDIUM:14:12:32
		 * 		SHORT:下午2:12
		 * getDateTimeInstance(参数一,参数二)
		 * 		2021年11月24日 星期三 下午02时14分58秒 CST
		 * 		
		 */
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df2 = DateFormat.getTimeInstance(DateFormat.FULL);
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		//日期：年月日：2021-11-24
		System.out.println(df1.format(date));
		//时间：时分秒：11:51:20
		System.out.println(df2.format(date));
		//日期+时间：2021-11-24 11:51:20
		System.out.println(df3.format(date));
		
		//parse():String -> Date
//		Date date1 = null;
//		try {
//			//DateFormat类型的df3是直接调用的getDateTimeInstance();
//			date1 = df3.parse("2021-11-24 11:51:20");
//		} catch (ParseException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//		System.out.println(date1);
		
	}
	//Datel类
	public static void DateTest1() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		
		Date date1 = new Date(1000);
		System.out.println(date1);
		
		//date1的时间是否子date的时间之后(之前)
		boolean n = date1.after(date);
		boolean m = date1.before(date);
		System.out.println(n);
		System.out.println(m);
		
		System.out.println(date.compareTo(date1));
	}
	//随机数
	public static void JiaoYanMa() {
		Random r = new Random();
		StringBuffer t = new StringBuffer();
		char a = (char)(r.nextInt(10)+48);
		char b = (char)(r.nextInt(26)+65);
		char c = (char)(r.nextInt(26)+97);
		char d = (char)(r.nextInt(20901)+19968);
		
		char[] str = {a,b,c,d};
		for(int i = 0; i < 4; i++) {
			int num = r.nextInt(4);
			t.append(str[num]);
		}
		System.out.println(t);
	}
	
	public static void UUIDTest() {
		for(int i = 0; i < 5;i++) {
			UUID uuid = UUID.randomUUID();
			System.out.println(uuid);
		}
	}
}