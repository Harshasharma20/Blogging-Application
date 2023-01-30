package com.spring.boot.comment.payloads;

public class CommentDto {
	
	private Integer comId;
	private String content;
	public Integer getComId() {
		return comId;
	}
	public void setComId(Integer comId) {
		this.comId = comId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CommentDto(Integer comId, String content) {
		super();
		this.comId = comId;
		this.content = content;
	}
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
