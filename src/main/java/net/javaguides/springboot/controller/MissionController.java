package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.RessourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.model.Mission;
import net.javaguides.springboot.repository.MissionRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController           
@RequestMapping("/api/v1/")

public class MissionController {

	@Autowired 
	private  MissionRepository missionRepository ; 
	
	//get all Missions 
	@GetMapping("/missions")
	public List<Mission> getAllMissions(){
		return missionRepository.findAll();   
	}   
	
	//create mission rest api
	
	@PostMapping("/createMissions")
	public Mission createMission(@RequestBody Mission mission) {
		return missionRepository.save(mission); 
	}
}
