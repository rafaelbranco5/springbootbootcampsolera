package com.teste.scoreboard.scoreboard.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.teste.scoreboard.scoreboard.Models.Job;
import com.teste.scoreboard.scoreboard.Models.Team;

@Component
public class JobDAOService {
	
	private static List<Job> jobs = new ArrayList<>();
	
	private static int jobCount = 0;
	
	static {
		jobs.add(new Job(++jobCount,"Assesment 1",100));
		jobs.add(new Job(++jobCount,"Assesment 2",50));
		jobs.add(new Job(++jobCount,"Assesment 3",85));
	}
	//List all
	public List<Job> findAll(){
		return jobs;
	}
	
	// Add Job
	public Job save(Job job) {
		job.setId(++jobCount);
		jobs.add(job);
		return job;
	}
	
	// Alter Job
	
}
