package com.teste.scoreboard.scoreboard.Models;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;

public class Team {

	// Properties
	private Integer id;
	private String name;
	private int score;
	private List<Job> job = new LinkedList<Job>();
	
	// Constructor
	public Team() {}

	public Team(Integer id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public Team(Integer id, String name, int score, List<Job> jobs) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.job = (LinkedList<Job>) jobs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LinkedList<Job> getJobs() {
		return (LinkedList<Job>) job;
	}

	public void setJobs(List<Job> temp) {
		this.job = temp;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", score=" + score + ", job=" + job + "]";
	}
	
}
