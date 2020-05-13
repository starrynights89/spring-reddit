package com.controllers;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.beans.posts;
import com.services.postservice;

public class PostController {
	
	//post make new
	//get: load post
	//delete: delete post
	//put: edit/upvote

    @Autowired
    private postservice ps;
    
	@GetMapping
	public List<posts> getAllPosts() {
		return ps.getAllPosts();
	}
    
	@GetMapping("/{id}")
	public posts getPostById(@PathVariable("id")int id) {
		return ps.getPostById(id).get(0);
	}
		
	@PostMapping
	public ResponseEntity addPost(@Valid @RequestBody posts post, BindingResult result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(
			ps.addPost(post));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity updatePost(@RequestBody posts post, BindingResult result) {
                return ResponseEntity.ok(ps.updatePost(post));
	}
	
	@DeleteMapping("/{id}")
	public String deletePostById(@PathVariable("id")int id) {
		return ps.deletePostById(id);
	}
	
	
}
