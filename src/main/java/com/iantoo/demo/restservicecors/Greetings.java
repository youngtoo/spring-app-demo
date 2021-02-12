package com.iantoo.demo.restservicecors;

public class Greetings {
	
	private final long id;
	private final String content;
	
	public Greetings() {
		
		this.id = 1;
		this.content = "Hello";
	}
	
	public Greetings(long id, String content) {
		this.id = id;
		this.content = content;
	}
	

}
