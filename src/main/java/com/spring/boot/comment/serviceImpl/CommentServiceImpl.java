package com.spring.boot.comment.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.comment.entities.Comment;
import com.spring.boot.comment.exception.ResourceNotFoundException;
import com.spring.boot.comment.repo.CommentRepo;
import com.spring.boot.comment.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	 @Autowired 
	 private CommentRepo commentRepo;
	
	 /* @Autowired private PostRepo postRepo;
	 */

	/*
	 * @Autowired private ModelMapper modelMapper;
	 */

	/*
	 * @Override public CommentDto createComment(CommentDto commentDto, Integer
	 * postId) { //Post post = this.postRepo.findById(postId).orElseThrow(()->new
	 * ResourceNotFoundException("Post","post id",postId)); Comment comment =
	 * this.modelMapper.map(commentDto, Comment.class); //comment.setPost(post);
	 * Comment saved = this.commentRepo.save(comment); return
	 * this.modelMapper.map(saved, CommentDto.class); }
	 */

	@Override
	public void deleteComment(Integer commentId) {
		Comment com = this.commentRepo.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "CommentId", commentId));
		this.commentRepo.delete(com);
	}
}
