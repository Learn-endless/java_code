package com.oracle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oracle.main.Task;

public class TestTask {
	
	Task task = new Task();
	@Test
	//�����Ƿ���������
	//1:��������		0������������
	public void testTriangle() {
		int result = task.isTriangle(1, 4, 5);
		// 1:��������
		// 0:����������
		assertEquals(0, result);
	}
	
	@Test
	//���Գɼ��ȼ�
	//1:��		2����		3����		4����		5������
	public void testGrade() {
		int result = task.testGrade(56);
		
		assertEquals(4,result);
	}
	
}
