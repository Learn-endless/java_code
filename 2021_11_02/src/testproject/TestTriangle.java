package testproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myproject.Triangle;

//�������
public class TestTriangle {
	Triangle triangle = new Triangle(3,4,5);  //����һ����
	@Test
	//���������ε�����
	public void testTriangleType() {
		String result = triangle.judgmentType();
		assertEquals("ֱ��������",result);
	}
	
	@Test
	//���������ε��ܳ�
	public void testTriangleGirth() {
		int result = triangle.girth();
		assertEquals(12,result);
	}
	
	@Test
	//���������ε����
	public void testTriangleArea() {
		double result = triangle.area();
		assertEquals((int)6.0,(int)result);
	}
}
