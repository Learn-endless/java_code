package com.j2se.work;

public class Test {
	public static void main(String[] args){
		Shape s = new Shape();
		
		MyShape n =new Rect(5,5);
		MyShape m =new Cricle(5);
		
		Master xx = new Master();
		xx.play(n);
		xx.play(m);
		
//		s.print(n);
//		System.out.println("=============");
//		s.print(m);
//		System.out.println("=============");
//		
//		Rect a = (Rect)n;
//		a.setHeight(3);
//		a.setWidth(4);
//		
//		Cricle b = (Cricle)m;
//		b.setR(2);
//		
//		s.print(a);
//		System.out.println("=============");
//		s.print(b);
//		System.out.println("=============");
	}
}
