package com.j2se.testdemo2;

public class ObjectTest<T> {
	private T obj;

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public ObjectTest() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public ObjectTest(T obj) {
		super();
		this.obj = obj;
	}


	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ObjectTest<Integer> oot = new ObjectTest<Integer>(new Integer(10));
		Integer i = oot.getObj();
//		String j = (String) oot.getObj();
		System.out.println(i);
		
		ObjectTest<String> oot1 = new ObjectTest<>(new String("agsdg"));
		String j = oot1.getObj();
		System.out.println(j);
	}

}
