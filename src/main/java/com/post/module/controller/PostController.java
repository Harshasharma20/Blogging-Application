package com.post.module.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.post.module.entities.Post;
import com.post.module.payload.ApiResponse;
import com.post.module.payload.PostDto;
import com.post.module.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService postService;
	
	
	
	@PutMapping("/update/{postId}")
	public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable Integer postId){
         PostDto updatePost = this.postService.updatePost(postDto, postId);
         return new ResponseEntity<PostDto>(updatePost,HttpStatus.OK);
	}
	
	//get all posts
	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPost()
	{
		List<PostDto> allPost=this.postService.getAllPost();
		return new ResponseEntity<List<PostDto>>(allPost,HttpStatus.OK);
	}
	
	//get post by id
	@GetMapping("/get/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId )
	{
		PostDto postDto = this.postService.getPostById(postId);
		return new ResponseEntity<PostDto>(postDto,HttpStatus.OK);
	}
	
	//delete post
	@DeleteMapping("/delete/{postId}")
	public ApiResponse deletePost(@PathVariable Integer postId)
	{
		this.postService.deletePost(postId);
		return new ApiResponse("Post is successfully deleted", true);
	}
	
	//insert post
	@PostMapping("/insert")
	public void insertPost(@RequestBody Post post)
	{
		postService.savePost(post);
	}
	
	
}

