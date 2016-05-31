package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class JsonData {

	@JsonView({JsonModule.CreateOrderModule.class, JsonModule.GetMovieListModule.class, JsonModule.GetCinemaListModule.class, JsonModule.GetSessionListModule.class})
	private List<Object> list;
	
    @JsonView(JsonModule.CinemaModule.class)
	private Cinema cinema;

	@JsonView(JsonModule.UserModule.class)
	private User user;

	@JsonView({JsonModule.CreateOrderModule.class})
	private Orders order;
	
	@JsonView({JsonModule.CreateOrderModule.class})
	private Session session;
	
	@JsonView(JsonModule.GetMovieInfoModule.class) 
	private Movie movie;
	
	public JsonData() {
		list = new ArrayList<Object>();
	}

	public List<Object> getList() {
		return list;
	}
	
	public <T> void setList(List<T> tmp_list) {
		list.clear();
		if (tmp_list == null) {
			return;
		} else {
			list.addAll(tmp_list);
		}
	}
	
	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}


}