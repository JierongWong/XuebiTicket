package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

	@JsonView({JsonModule.GetSessionListModule.class, JsonModule.GetCinemaListModule.class})
	private int session_id;
	
	private int cinema_id;
	
	@JsonView({JsonModule.GetSessionListModule.class, JsonModule.CreateOrderModule.class})
	private String movie_name;
	
	@JsonView({JsonModule.GetSessionListModule.class, JsonModule.CreateOrderModule.class})
	private long start_time;
	
	@JsonView({JsonModule.GetSessionListModule.class, JsonModule.CreateOrderModule.class})
	private long end_time;
	
	@JsonView({JsonModule.GetSessionListModule.class, JsonModule.GetCinemaListModule.class})
	private float price;

	public Session(int cinemaID, String movieName, long start_time, long end_time, float price) {
		super();
		this.cinema_id = cinemaID;
		this.movie_name = movieName;
		this.start_time = start_time;
		this.end_time = end_time;
		this.price = price;
	}
	public Session() {
		super();
	}
	
	public int getSessionId() {
		return session_id;
	}
	public void setSessionId(int id) {
		this.session_id = id;
	}
	public int getCinemaID() {
		return cinema_id;
	}
	public void setCinemaID(int cinemaID) {
		this.cinema_id = cinemaID;
	}
	public String getMovieName() {
		return movie_name;
	}
	public void setMovieName(String movieName) {
		this.movie_name = movieName;
	}
	public long getStartTime() {
		return start_time;
	}
	public void setStartTime(long start_time) {
		this.start_time = start_time;
	}
	public long getEndTime() {
		return end_time;
	}
	public void setEndTime(long end_time) {
		this.end_time = end_time;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}

