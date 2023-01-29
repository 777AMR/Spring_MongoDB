package com.ramazanov.joblisting.repo;

import com.ramazanov.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
