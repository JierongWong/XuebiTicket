package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class Ticket {
	private int ticket_id;
	private int order_id;
	// private int seat;
	private float price;
	private int session_id;

	public Ticket(int orderID, float price, int sessionID) {
		super();
		this.order_id = orderID;
		this.price = price;
		this.session_id = sessionID;
	}
	public Ticket() {
		super();
	}

	public int getTicketId() {
		return ticket_id;
	}
	public void setId(int id) {
		this.ticket_id = id;
	}
	public int getOrderID() {
		return order_id;
	}
	public void setOrderID(int orderID) {
		this.order_id = orderID;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getSessionID() {
		return session_id;
	}
	public void setSessionID(int sessionID) {
		this.session_id = sessionID;
	}
}