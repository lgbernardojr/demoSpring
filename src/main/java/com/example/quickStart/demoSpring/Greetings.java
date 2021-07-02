package com.example.quickStart.demoSpring;


public class Greetings {
	private final long id;
	private final String content;
	private final String name;
	
	public Greetings(long id, String content, String name) {
		super();
		this.id = id;
		this.content = content;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

}
