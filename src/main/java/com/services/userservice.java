package com.services;
import java.util.List;

import com.beans.users;

public interface userservice {
	public List<users> getAllUsers();
	public List<users> getUserByUsername(String username);
	public List<users> getUserById(int id);
	public users addUser(users user);
	public users updateUser(users user);
	public String deleteUserById(int id);
}
