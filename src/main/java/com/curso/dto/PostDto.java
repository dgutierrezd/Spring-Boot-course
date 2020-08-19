package com.curso.dto;

import java.io.Serializable;

public class PostDto implements _DTOEntity {
	
	private int idPost;
	private String textPost;
	private int idUser;
	
	public PostDto(int idPost, String textPost, int idUser) {
		super();
		this.idPost = idPost;
		this.textPost = textPost;
		this.idUser = idUser;
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

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	

}
