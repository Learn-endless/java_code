package com.oracle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.oracle.main.Task;

public class TestTask {
	
	Task task = new Task();
	@Test
	//�����Ƿ���������
	public void testTriangle() {
		int result = task.isTriangle(1, 4, 5, "���ܹ���������");
		assertEquals(1, result);
	}
	
	@Test
	//���Գɼ��ȼ�
	public void testGrade() {
		int result = task.testGrade(56, "��");
		assertEquals(1,result);
	}
	
}
