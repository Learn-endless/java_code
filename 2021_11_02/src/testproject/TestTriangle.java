package testproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myproject.Triangle;

//单组测试
public class TestTriangle {
	Triangle triangle = new Triangle(3,4,5);  //输入一组数
	@Test
	//测试三角形的类型
	public void testTriangleType() {
		String result = triangle.judgmentType();
		assertEquals("直角三角形",result);
	}
	
	@Test
	//测试三角形的周长
	public void testTriangleGirth() {
		int result = triangle.girth();
		assertEquals(12,result);
	}
	
	@Test
	//测试三角形的面积
	public void testTriangleArea() {
		double result = triangle.area();
		assertEquals((int)6.0,(int)result);
	}
}
