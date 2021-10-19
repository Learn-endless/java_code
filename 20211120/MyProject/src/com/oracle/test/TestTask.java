package com.oracle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oracle.main.Task;

public class TestTask {
	
	Task task = new Task();
	@Test
	//测试是否是三角形
	public void testTriangle() {
		int result = task.isTriangle(1, 4, 5, "不能构成三角形");
		assertEquals(1, result);
	}
	
	@Test
	//测试成绩等级
	public void testGrade() {
		int result = task.testGrade(56, "差");
		assertEquals(1,result);
	}
	
}
