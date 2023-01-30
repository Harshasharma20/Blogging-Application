package com.spring.boot.comment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.comment.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer>{

}
