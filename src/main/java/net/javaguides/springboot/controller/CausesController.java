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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.exception.RessourceNotFoundException;
import net.javaguides.springboot.model.Causes;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.CausesRepository;
import net.javaguides.springboot.repository.EmployeeRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController           
@RequestMapping("/api/v1/")
public class CausesController {
	
	@Autowired 
	private CausesRepository causesRepository ; 
	
	//get all causes
		@GetMapping("/getCauses")
		public List<Causes> getAllCcauses(){
			return causesRepository.findAll();  
		}
		
	//create dates et causes rest api
		
		@PostMapping("/CreateCauses")
		public Causes createCause(@RequestBody Causes cause) {
			return causesRepository.save(cause);   
		}
	
		//delete employee rest api 
		
	    @DeleteMapping("/causes/{id}")
	    public ResponseEntity<Map<String , Boolean>> deleteCause(@PathVariable Long id )
	    		throws RessourceNotFoundException {
	    	Causes Causes = causesRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("cause not found for this id : " + id));
	    	
	    	causesRepository.delete(Causes);
	   	Map<String , Boolean> response = new HashMap<>();
	   	response.put("deleted" , Boolean.TRUE);
	   	
	   	 return ResponseEntity.ok(response) ; 
	   }
}
