package com.curso.dto;

import java.io.Serializable;

public class PostDto implements Serializable {
	
	private int idPost;
	private String textPost;
	
	public PostDto(int idPost, String textPost) {
		super();
		this.idPost = idPost;
		this.textPost = textPost;
	}
	
	public PostDto() {
		
	}

	public int getIdPost() {
		return idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}

	public String getTextPost() {
		return textPost;
	}

	public void setTextPost(String textPost) {
		this.textPost = textPost;
	}
	
	

}
