package com.j2se.work;

public class Cricle extends MyShape{
	public static final double PI = 3.14;
	private double r;

	public Cricle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cricle(double r) {
		super();
		this.r = r;
	}
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}

	@Override
	public double getLen() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}
	
	public void play(){
		System.out.println("т╡пн");
	}
}
