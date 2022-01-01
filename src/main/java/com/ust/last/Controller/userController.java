package com.ust.last.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import java.util.*;

import com.ust.last.Model.User;
import com.ust.last.Repository.userRepository;
import com.ust.last.Service.userServiceImpl;


@RestController
@CrossOrigin("http://localhost:4200")

public class userController {
	
	
	@Autowired
	private userRepository userrepository;
	@Autowired 
	private userServiceImpl userService;
	
	
	@GetMapping("/users")
	public  List<User> getAllUsers(){
		return userService.getAllUsers();
		
	}
	
	
	@PostMapping("/users")
	public ResponseEntity<?> registerUser(@RequestBody User user){
		
            userrepository.save(user);
			return new ResponseEntity<String>("User registered successfully",HttpStatus.CREATED);
		
	}
	
	

}
