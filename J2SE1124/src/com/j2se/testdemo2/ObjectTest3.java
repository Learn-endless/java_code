package com.j2se.testdemo2;

public class ObjectTest3 {
	//��ӡ�������͵�����
	public <E> void printArr(E[] arr) {
		for(E e:arr) {
			System.out.print(e+"");
		}
	}
	//���Ͳ���
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ObjectTest3 o1 = new ObjectTest3();
		String[] strArr = {"abc","def"};
		o1.printArr(strArr);
		System.out.println();
		Integer[] arr = {1,2,3,4,5,6,7};
		o1.printArr(arr);
	}
}
