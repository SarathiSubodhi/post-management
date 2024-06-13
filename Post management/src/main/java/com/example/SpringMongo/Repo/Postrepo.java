package com.example.SpringMongo.Repo;

import com.example.SpringMongo.Entity.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Postrepo extends MongoRepository<Posts,String> {
}
