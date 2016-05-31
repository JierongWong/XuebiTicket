package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class Cinema {

	@JsonView({JsonModule.CinemaModule.class, JsonModule.GetCinemaListModule.class})
	private int cinema_id;
	@JsonView({JsonModule.CinemaModule.class, JsonModule.GetCinemaListModule.class})
	private String cinema_name
	@JsonView({JsonModule.CinemaModule.class, JsonModule.GetCinemaListModule.class})
	private String cinema_address;

	@JsonView(JsonModule.GetCinemaListModule.class})
	private List<Session> sessions_list;

	public int getId() {
		return cinema_id;
	}
	public void setId(int id) {
		this.cinema_id = id;
	}
	public String getCinemaName() {
		return cinema_name;
	}
	public void setCinemaName(String new_name) {
		this.cinema_name = new_name;
	}
	public String getCinemaAddress() {
		return cinema_address;
	}
	public void setCinemaAddress(String address) {
		this.cinema_address = address;
	}
	public List<Session> getSessionList() {
		return sessions_list;
	}
	public void setSessionsList(List<Session> new_list) {
		this.sessions_list = new_list;
	}

}
