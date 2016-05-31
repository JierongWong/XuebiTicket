package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class Movie {

	@JsonView({JsonModule.GetMovieInfoModule.class, JsonModule.GetMovieListModule.class})
	private int movie_id;
	@JsonView({JsonModule.GetMovieInfoModule.class, JsonModule.GetMovieListModule.class})
	private String movie_name;
	@JsonView({JsonModule.GetMovieInfoModule.class, JsonModule.GetMovieListModule.class})
	private String type;
	@JsonView({JsonModule.GetMovieInfoModule.class, JsonModule.GetMovieListModule.class})
	private String intro;
	@JsonView({JsonModule.GetMovieInfoModule.class, JsonModule.GetMovieListModule.class})
	private float star;

	@JsonView(JsonModule.GetMovieInfoModule.class)
	private long movie_length;
	@JsonView(JsonModule.GetMovieInfoModule.class)
	private String movie_director;
	@JsonView(JsonModule.GetMovieInfoModule.class)
	private List<String> movie_actors;

	private long start_time;
	private long end_time;

    public int getMovieId() {
		return movie_id;
	}
	public void setMovieId(int id) {
		this.movie_id = id;
	}
	public String getMovieName() {
		return movie_name;
	}
	public void setMovieName(String new_name) {
		this.movie_name = new_name;
	}
		public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIntroduction() {
		return intro;
	}
	public void setIntroduction(String introduction) {
		this.intro = introduction;
	}
	public float getStar() {
		return star;
	}
	public void setStar(float star) {
		this.star = star;
	}
	public long getMovieLength() {
		return movie_length;
	}
	public void setMovieLength(long length) {
		this.movie_length = length;
	}
	public String getMovieDirector() {
		return movie_director;
	}
	public void setMovieDirector(String director) {
		this.movie_director = director;
	}
	public List<String> getMovieActors() {
		return movie_actors;
	}
	public void setMovieActors(List<String> actors) {
		this.movie_actors = actors;
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

}