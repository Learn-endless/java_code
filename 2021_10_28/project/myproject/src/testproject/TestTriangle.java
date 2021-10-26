package testproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import myproject.Triangle;

public class TestTriangle {
	Triangle triangle = new Triangle(3,4,5);
	@Test
	public void testTriangleType() {
		String result = triangle.judgmentType();
		assertEquals("Ö±½ÇÈý½ÇÐÎ",result);
	}
	
	@Test
	public void testTriangleGirth() {
		int result = triangle.girth();
		assertEquals(12,result);
	}
	
	@Test
	public void testTriangleArea() {
		double result = triangle.area();
		assertEquals((int)6.0,(int)result);
	}
}
