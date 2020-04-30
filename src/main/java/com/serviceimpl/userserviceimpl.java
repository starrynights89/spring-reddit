package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.users;
import com.repositories.usersrep;
import com.services.usersservice;

@Service
public class userserviceimpl implements usersservice {
	
	@Autowired
	private usersrep ur;
	
	@Override
	public List<users> getUserByUsername(String username) {
		return ur.getUserByUsername(username);
	}
	
	@Override
	public users addUser(users user) {
		return ur.save(user);
	}

	@Override
	public users updateUser(users user) {
		return ur.save(user);
	}
	
	@Override
	public String deleteUserById(int id) {
		ur.deleteById(id);
		return "User with id: " + id + " was deleted.";
	}

}