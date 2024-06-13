package com.example.SpringMongo.Controller;

import com.example.SpringMongo.Entity.Posts;
import com.example.SpringMongo.Service.Postservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/post")

public class PostController {

    @Autowired
    private Postservice postservice;

    @PostMapping(value = "/save")
    private String savePost(@RequestBody Posts post)
    {
        postservice.saveorUpdate(post);
        return post.get_id();

    }

    @GetMapping(value = "/getAll")
    public Iterable<Posts>getPost()
    {
        return postservice.listAll();

    }

    @PutMapping(value = "/edit/{id}")
    private Posts update(@RequestBody Posts posts,@PathVariable(name="id")String _id)
    {
        posts.set_id(_id);
        postservice.saveorUpdate(posts);
        return posts;

    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<?> deletepost(@PathVariable("id") String _id) {
        try {
            postservice.deletepost(_id);
            return ResponseEntity.ok("Delete successful for ID: " + _id);  // Properly return a response indicating success without a body
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Failed to delete post with ID: " + _id + " due to: " + e.getMessage());
        }
    }

}