package com.j2se.test1;

public class Administ {
	private String name;
	
	public Administ() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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

	//������ticket
	public void open(Ticket n) {
		n.setTicketState(true);
	}
	
	//������ticket
	public void close(Ticket n) {
		n.setTicketState(false);
	}
}
