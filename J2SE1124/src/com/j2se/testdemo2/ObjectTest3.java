package com.j2se.testdemo2;

public class ObjectTest3 {
	//打印各种类型的数组
	public <E> void printArr(E[] arr) {
		for(E e:arr) {
			System.out.print(e+"");
		}
	}
	//类型擦除
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ObjectTest3 o1 = new ObjectTest3();
		String[] strArr = {"abc","def"};
		o1.printArr(strArr);
		System.out.println();
		Integer[] arr = {1,2,3,4,5,6,7};
		o1.printArr(arr);
	}
}
