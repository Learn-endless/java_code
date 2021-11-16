package com.j2se.test1;

public class Ticket {
	private String ticketName;
	private int ticketPrice;
	private boolean ticketState = false;
	
	public Ticket(String ticketName, int ticketPrice) {
		super();
		this.ticketName = ticketName;
		this.ticketPrice = ticketPrice;
	}
	
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public boolean isTicketState() {
		return ticketState;
	}
	public void setTicketState(boolean ticketState) {
		this.ticketState = ticketState;
	}
}
