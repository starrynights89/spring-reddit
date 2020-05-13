package com.services;
import java.util.List;
import com.beans.comments;

public interface commentservice {
    public List<comments> getAllComments();
    public List<comments> getCommentById(int id);
    public comments addComment(comments comment);
    public comments updateComment(comments comment);
	public String deleteCommentById(int id);
}
