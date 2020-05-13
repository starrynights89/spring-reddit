package com.repositories;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beans.comments;
import com.beans.posts;

	@Repository
	public interface commentrep extends JpaRepository<comments, Integer>{
		
		@Query("select c from comments c")
	    public List<comments> getAllComments();
	    
		@Query("select c from comments c where c.id = ?1")
	    public List<comments> getCommentById(int id);
		
}
