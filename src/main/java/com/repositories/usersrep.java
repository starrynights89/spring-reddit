package com.repositories;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beans.users;

	@Repository
	public interface usersrep extends JpaRepository<users, Integer>{
		
		@Query("select u from users u")
		public List<users> getAllUsers();
		
		@Query("select u from users u where u.username = ?1")
		public List<users> getUserByUsername(String username);
		
		@Query("select u from users u where u.id = ?1")
		public List<users> getUserById(int id);
}
