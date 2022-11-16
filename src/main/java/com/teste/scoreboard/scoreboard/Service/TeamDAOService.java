package com.teste.scoreboard.scoreboard.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Component;

import com.teste.scoreboard.scoreboard.Models.Team;

@Component
public class TeamDAOService {

private static List<Team> teams = new ArrayList<>();

	private static int teamCount = 0;

	static {
		teams.add(new Team(++teamCount,"Team 1",38));
		teams.add(new Team(++teamCount,"Team 2",45));
		teams.add(new Team(++teamCount,"Team 3",54));
	}
	
	// List all
	public List<Team> findAll(){
		return teams;
	}

	// Find one by id
	public Team findOne(Integer id) {
	Predicate<? super Team> predicate = team -> team.getId().equals(id);
	return teams.stream().filter(predicate).findFirst().get();
	}
	
	// Save Team
	public Team save(Team team) {
		team.setId(++teamCount);
		teams.add(team);
		return team;
	}
	
	// Add job
	
}
