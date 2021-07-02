package com.example.quickStart.demoSpring;

public class Human {

	private int id;
	private String name;
	private long points;
	
	public Human(){}
	
	public Human(int id, String name, long points) {
		super();
		this.id = id;
		this.name = name;
		this.points = points;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
}
