package com.chambertran.chamberfood.models;

public class Client {
	
	private String name;
	private String email;
	private String mobile;
	private boolean active = false;
	
	public Client(String name, String email, String mobile) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public boolean isActive() {
		return active;
	}

	public void activate() {
		this.active = true;
	}
}
