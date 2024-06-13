package com.example.SpringMongo.Service;


import com.example.SpringMongo.Entity.Posts;
import com.example.SpringMongo.Repo.Postrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Postservice {

    @Autowired
    private Postrepo reop;



    public void saveorUpdate(Posts post) {

        reop.save(post);
    }

    public Iterable<Posts> listAll() {
        return this.reop.findAll();
    }

    public void deletepost(String id) {
        reop.deleteById(id);
    }
}
