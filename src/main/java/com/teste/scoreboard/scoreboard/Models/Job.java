package com.teste.scoreboard.scoreboard.Models;

public class Job {

	// Properties
	private Integer id;
	private String name;
	private int score;
	
	// Constructor
	public Job(Integer id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
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
		if (name.equals("")) {
			System.out.print("Name cannot be null.");
		}else {
			this.name = name;
		}
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score < 0 ) {
			System.out.print("Score cannot be negative");
		}else {
			this.score = score;
		}
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
	
}
