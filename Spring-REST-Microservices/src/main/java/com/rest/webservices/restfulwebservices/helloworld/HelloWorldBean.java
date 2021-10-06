package com.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

	private String message;
	private int id;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message, int id) {
		this.message = message;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

}
