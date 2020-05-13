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

import com.beans.comments;
import com.services.commentservice;
import com.services.postservice;

public class CommentController {
	
	//post make comment
	//get: load comment
	//delete: delete comment
	//put: edit/upvote comment
	

    @Autowired
    private commentservice cs;
    
	@GetMapping
	public List<comments> getAllComments() {
		return cs.getAllComments();
	}
    
	@GetMapping("/{id}")
	public comments getCommentById(@PathVariable("id")int id) {
		return cs.getCommentById(id).get(0);
	}
		
	@PostMapping
	public ResponseEntity addComment(@Valid @RequestBody comments comment, BindingResult result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(
			cs.addComment(comment));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity updateComment(@RequestBody comments comment, BindingResult result) {
                return ResponseEntity.ok(cs.updateComment(comment));
	}
	
	@DeleteMapping("/{id}")
	public String deleteCommentById(@PathVariable("id")int id) {
		return cs.deleteCommentById(id);
	}
	
	
}
