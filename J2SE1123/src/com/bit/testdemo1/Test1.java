package com.bit.testdemo1;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			System.out.println(10 / 0);

			System.out.println("try!!!");

		} catch (Exception e) {

			System.out.println("��0�����쳣��");

			System.exit(0);

		} finally {

			System.out.println("finally���ܻ�ִ�У�");
		}

	}
}
