package com.rj.entity;

public class UserInfo {
	private int uid;
	private String username;
	private String password;
	private String email;
	private String status;
	
	
	public UserInfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserInfo(int uid, String username, String password, String email,
			String status) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
	}
	public UserInfo() {
		super();
	}
	public UserInfo(String username, String password, String email, String status) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.status = status;
	}
	public UserInfo(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
