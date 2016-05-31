package java.com.XuebiTicket.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

public class User {

	@JsonView(JsonModule.UserModule.class)
	private int user_id;
	@JsonView(JsonModule.UserModule.class)
	private String user_name;
	@JsonView(JsonModule.UserModule.class)
	private String password;
	@JsonView(JsonModule.UserModule.class)
	private String phone;
	@JsonView(JsonModule.UserModule.class)
	private String email;

	public User(String user_name, String password, String telephone, String email) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.phone = telephone;
		this.email = email;
	}
	public User() {
		super();
	}

	public int getUserId() {
		return user_id;
	}
	public void setUserId(int id) {
		this.user_id = id;
	}
	public String getUsername() {
		return user_name;
	}
	public void setUsername(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String telephone) {
		this.phone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}