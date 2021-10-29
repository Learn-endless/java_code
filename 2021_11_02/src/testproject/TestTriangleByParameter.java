package testproject;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import myproject.Triangle;

@RunWith(Parameterized.class)
public class TestTriangleByParameter {
	private String param1;		//接收边长a的值
	private String param2;		//接收边长b的值
	private String param3;		//接收边长c的值
	private String result1;		//接收三角形的周长
	private String result2;		//接收三角形的面积
	private String result3;		//接收三角形的类型
	
	public TestTriangleByParameter(String param1,String param2,String param3,String result1,String result2,String result3) {
		super();
		this.param1 = param1;		//接收边长a的值
		this.param2 = param2;		//接收边长b的值
		this.param3 = param3;		//接收边长c的值
		this.result1 = result1;		//接收三角形的周长
		this.result2 = result2;		//接收三角形的面积
		this.result3 = result3;		//接收三角形的类型
	}
	
	@Parameters
	public static Collection getData() {
		try {
			//从text_data.txt文件中读数据
			BufferedReader reader=new BufferedReader(new FileReader("src\\testproject\\test_data.txt"));
			String line = null;
			List<String []> list=new ArrayList<>();
			//一行一行的读取文本文件中的数
			while((line=reader.readLine())!=null) {
				//把每一行的内容都分割为一个字符串数组
				String [] strarr=line.split(",");
				//添加到末尾
				list.add(strarr);
			}
			reader.close();
			return list;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	@Test
	//测试三角形的周长
	public void test_girth() {
		//使用Integer.parseInt()把字符串转化为整数
		Triangle triangle = new Triangle(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3));
		//测试三角形周长方法
		int ret = triangle.girth();
		//断言结果是否相等
		assertEquals(Integer.parseInt(result1),ret);
	}
		
	@Test
	//测试三角形的面积
	public void test_area() {
		Triangle triangle = new Triangle(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3));
		//测试三角形面积方法
		double ret = triangle.area();
		//使用Double.parseDouble()把字符串转化为浮点数
		
		//使用if判断是否相等
		if(Double.parseDouble(result2)==ret) {
			//通过断言进行检测
			assertEquals(1,1);
		}else {
			assertEquals(1,0);
		}
	}
		
	@Test
	//测试三角形的类型
	public void test_judgmentType() {
		Triangle triangle = new Triangle(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3));
		//测试三角形类型方法
		String ret = triangle.judgmentType();
		//使用字符串.equals()判断是否相等
		if(result3.equals(ret)) {
			assertEquals(1,1);
		}else {
			assertEquals(1,0);
		}
	}	
}







