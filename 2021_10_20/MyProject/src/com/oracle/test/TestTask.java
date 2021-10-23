package com.oracle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oracle.main.Task;

public class TestTask {
	
	Task task = new Task();
	@Test
	//测试是否是三角形
	//1:是三角形		0：不是三角形
	public void testTriangle() {
		int result = task.isTriangle(1, 4, 5);
		// 1:是三角形
		// 0:不是三角形
		assertEquals(0, result);
	}
	
	@Test
	//测试成绩等级
	//1:优		2：良		3：中		4：差		5：出错
	public void testGrade() {
		int result = task.testGrade(56);
		
		assertEquals(4,result);
	}
	
}
