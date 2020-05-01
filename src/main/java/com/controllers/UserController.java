package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.beans.users;
import com.services.usersservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
@CrossOrigin
@SessionAttributes(value= "user")

//get: get user
//post, make user
//update user
//delete user

public class UserController {
    
    @Autowired
    private usersservice us;
    //private, name, putyourservices here
	
	/**
	 * HTTP GET method (/users)
	 * 
	 * @param isDriver represents if the user is a driver or rider.
	 * @param username represents the user's username.
	 * @param location represents the batch's location.
	 * @return A list of all the users, users by is-driver, user by username and users by is-driver and location.
	 */
	
/*	@GetMapping
	public List<users> getUsers(){
		return us.getUsers();
	}*/
	
	/**
	 * HTTP GET (users/{id})
	 * 
	 * @param id represents the user's id.
	 * @return A user that matches the id.
	 */
	@GetMapping
	public List<users> getAllUsers() {
		return us.getAllUsers();
	}
    
	@GetMapping("/{id}")
	public users getUserById(@PathVariable("id")int id) {
		
		return us.getUserById(id).get(0);
	}
	
	@GetMapping("/{username}")
	public users getUserByUsername(@PathVariable("username")String username) {
		
		return us.getUserByUsername(username).get(0);
	}
	
	@PostMapping
	public ResponseEntity addUser(@Valid @RequestBody users user, BindingResult result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(
			us.addUser(user));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity updateUser(@RequestBody users user, BindingResult result) {
                return ResponseEntity.ok(us.updateUser(user));
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable("id")int id) {
		return us.deleteUserById(id);
	}
	
}
