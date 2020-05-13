package com.services;
import java.util.List;
import javax.validation.Valid;
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
import com.beans.users;

public interface postservice {
    public List<posts> getAllPosts();
    public List<posts> getPostById(int id);
    public posts addPost(posts post);
    public posts updatePost(posts post);
	public String deletePostById(int id);
}
