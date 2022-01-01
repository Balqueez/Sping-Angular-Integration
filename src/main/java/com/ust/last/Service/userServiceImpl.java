package com.ust.last.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ust.last.Model.User;
import com.ust.last.Repository.userRepository;



@Service
public class userServiceImpl {

private final userRepository UserRepository;
	
	@Autowired
	public userServiceImpl(userRepository userRepository) {
		super();
		this.UserRepository = userRepository;
		}
	
    public List<User> getAllUsers() {
		return (List<User>) UserRepository.findAll();
	}
	
	public void saveUser(User user) {
		UserRepository.save(user);
		
	}

	

}

