package com.j2se.work;

public class Rect extends MyShape{
	private double width;
	private double height;
	
	public Rect() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rect(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getLen() {
		// TODO Auto-generated method stub
		return (width+height)*2.0;
	}
	
	public void play(){
		System.out.println("¾ØÐÎ");
	}
}
