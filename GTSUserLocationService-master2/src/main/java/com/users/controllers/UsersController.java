package com.users.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.users.controllers.exceptions.RecordNotFoundException;
import com.users.model.Users;
import com.users.repositories.UsersRepository;



@RestController
@RequestMapping("/users")
public class UsersController {


	@Autowired
    UsersRepository tRepo;
	
	

	
	@PostMapping("/create")            
	public ResponseEntity<Users> createUser(@RequestBody Users users){
		
	    
	         
	    	   Users t1 =  tRepo.findByTcontactno(users.getTcontactno());
	    	
	    	      if( t1 == null) {
               	    tRepo.save(users);
                   	   return ResponseEntity.ok().body(users);
	    	   
	    	      }else {
	    	    	  return ResponseEntity.status(HttpStatus.CONFLICT).build();
	    	            }
	    	  }
	        
	
	@GetMapping("/getAll")                                   
	public List<Users> getAllUsers() {
		return (List<Users>) tRepo.findAll();
	}
	
	@GetMapping("/getUser/{tcontactno}")          
	public ResponseEntity<Users> getUserByTcontactno(@PathVariable(value = "tcontactno") Long userTcontactno) throws RecordNotFoundException {
  
		Users t2 = tRepo.findByTcontactno(userTcontactno);

		if(t2 != null) {
          		return ResponseEntity.ok().body(t2);
	     }else {
		        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	  }
      
	}
	
	@DeleteMapping("/delete/{tcontactno}")     
	public Map<String, Boolean> deleteUserByTcontactno(@PathVariable(value = "tcontactno") Long userTcontactno) throws RecordNotFoundException {
		
		Users t3 = tRepo.findByTcontactno(userTcontactno);
		Map<String, Boolean> response = new HashMap<>();
		
		if( t3!= null) {
		       tRepo.delete(t3);
		       response.put("deleted", Boolean.TRUE);
		       return response;
		}else {
			response.put("can not deleted", Boolean.FALSE);
			return response;
		 }
	}
			
		@PutMapping("/update")  
		public ResponseEntity<Users>saveOrUpdateUsers( @RequestBody Users users) {
			

	      
		
	         tRepo.save(users);
			return ResponseEntity.ok(users);
		
		
		}  


}
