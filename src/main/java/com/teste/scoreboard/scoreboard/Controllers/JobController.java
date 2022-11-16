package com.teste.scoreboard.scoreboard.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.scoreboard.scoreboard.Models.Job;
import com.teste.scoreboard.scoreboard.Service.JobDAOService;

@RestController
public class JobController {
	
	private JobDAOService service;
	
	public JobController(JobDAOService service) {
		this.service = service;
	}

	@GetMapping("/jobs")
	public List<Job> retrieveAllJobs(){
		return service.findAll();
	}
	
	@GetMapping("/jobtest")
	public String test() {
		return "JOBS!!";
	}
}