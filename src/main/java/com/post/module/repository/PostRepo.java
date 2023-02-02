package com.post.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.post.module.entities.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
