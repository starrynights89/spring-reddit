package com.services;
import java.util.List;

import com.beans.users;

public interface usersservice {
	public List<users> getUserByUsername(String username);
	public users addUser(users user);
	public users updateUser(users user);
	public String deleteUserById(int id);
}
