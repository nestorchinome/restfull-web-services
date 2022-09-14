package com.project1.rest.webservices.restfullwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	
	private UserDAOService userDAOService;
	
	
	public UserResource(UserDAOService service) {
		this.userDAOService = service;
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userDAOService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable Integer id) {
		return userDAOService.findOne(id);
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userDAOService.save(user);
	}
}
