package com.post.module.payload;

import java.util.Date;

public class PostDto {

	private Integer postId;
	private String title;
	private String content;
	private String imageName;
	private Date addedDate;
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	

}
