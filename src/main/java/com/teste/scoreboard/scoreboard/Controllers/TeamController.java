package com.teste.scoreboard.scoreboard.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teste.scoreboard.scoreboard.Models.Team;
import com.teste.scoreboard.scoreboard.Service.TeamDAOService;

@RestController
public class TeamController {

	private TeamDAOService service;
	
	public TeamController(TeamDAOService service) {
		this.service = service;
	}
	
	@GetMapping("/teams")
	public List<Team> retrieveAllTeams(){
		return service.findAll();
	}
	
	@GetMapping("/team/{id}")
	public Team retrieveTeam(@PathVariable int id){
		return service.findOne(id);
	}
	
	@PostMapping("/teams")
	public void createTeam(@RequestBody Team team) {
		service.save(team);
	}
	
	@PutMapping("/team/{id}")
	public ResponseEntity<Team> addJobToTeam(@RequestBody Team team, @PathVariable int id) {
		Team selectedTeam = service.findOne(id);
		// selectedTeam.setJobs()
		
		return null;
	}
}
