package com.post.module.service;

import java.util.List;

import com.post.module.entities.Post;
import com.post.module.payload.PostDto;

public interface PostService {
	
	//update
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all posts
	List<PostDto> getAllPost();
	
	//get single post
	PostDto getPostById(Integer postId);
	
	//save post
	public void savePost(Post post);
	
	
	

}

