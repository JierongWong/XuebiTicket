package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class Order {

	@JsonView(JsonModule.CreateOrderModule.class)
	private int order_id;
	@JsonView(JsonModule.CreateOrderModule.class)
	private int user_id;
	@JsonView(JsonModule.CreateOrderModule.class)
	private int cinema_id;
	@JsonView(JsonModule.CreateOrderModule.class)
	private long order_time;
	@JsonView(JsonModule.CreateOrderModule.class)
	private float price;

	private String state;

	public Orders(int userID, int cinemaID, long time, float prices, String state) {
		super();
		this.user_id = userID;
		this.cinema_id = cinemaID;
		this.order_time = time;
		this.price = price;
		this.state = state;
	}
	public Orders() {
		super();
	}

	public int getOrderId() {
		return order_id;
	}
	public void setOrderId(int id) {
		this.order_id = id;
	}
	public int getUserID() {
		return user_id;
	}
	public void setUserID(int userID) {
		this.user_id = userID;
	}
	public int getCinemaID() {
		return cinema_id;
	}
	public void setCinemaID(int cinemaID) {
		this.cinema_id = cinemaID;
	}
	public long getOrderTime() {
		return order_time;
	}
	public void setTime(long time) {
		this.order_time = time;
	}
	public float getPrices() {
		return prices;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}