package com.j2se.test1;

public class Administ {
	private String name;
	
	public Administ() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public Administ(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//设置有ticket
	public void open(Ticket n) {
		n.setTicketState(true);
	}
	
	//设置无ticket
	public void close(Ticket n) {
		n.setTicketState(false);
	}
}
