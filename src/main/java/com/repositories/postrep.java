package com.repositories;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.beans.posts;

	@Repository
	public interface postrep extends JpaRepository<posts, Integer>{
		
		@Query("select p from posts p")
	    public List<posts> getAllPosts();
	    
		@Query("select p from posts p where p.id = ?1")
	    public List<posts> getPostById(int id);
	    
}
