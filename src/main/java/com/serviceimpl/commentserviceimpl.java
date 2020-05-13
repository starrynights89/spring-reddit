package com.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.beans.comments;
import com.repositories.commentrep;
import com.services.commentservice;

@Service
public class commentserviceimpl implements commentservice {
	
	@Autowired
	private commentrep cr;
	
	@Override
    public List<comments> getAllComments(){
    	return cr.getAllComments();
    }
	@Override
    public List<comments> getCommentById(int id){
    	return cr.getCommentById(id);
    }
	@Override
    public comments addComment(comments comment) {
		return cr.save(comment);
	}
	@Override
    public comments updateComment(comments comment) {
		return cr.save(comment);
	}
	@Override
    public String deleteCommentById(int id) {
		cr.deleteById(id);
		return "Post with id: " + id + "was deleted.";
	}

}