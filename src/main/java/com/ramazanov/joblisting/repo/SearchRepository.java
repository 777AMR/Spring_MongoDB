package com.ramazanov.joblisting.repo;

import com.ramazanov.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
