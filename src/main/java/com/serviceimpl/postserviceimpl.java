package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.posts;
import com.beans.users;
import com.repositories.postrep;
import com.repositories.usersrep;
import com.services.postservice;
import com.services.usersservice;

@Service
public class postserviceimpl implements postservice {
	
	@Autowired
	private postrep pr;
	
	@Override
    public List<posts> getAllPosts(){
    	return pr.getAllPosts();
    }
	@Override
    public List<posts> getPostById(int id){
    	return pr.getPostById(id);
    }
	@Override
    public posts addPost(posts post) {
		return pr.save(post);
	}
	@Override
    public posts updatePost(posts post) {
		return pr.save(post);
	}
	@Override
    public String deletePostById(int id) {
		pr.deleteById(id);
		return "Post with id: " + id + "was deleted.";
	}

}