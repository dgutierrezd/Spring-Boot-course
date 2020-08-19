package com.curso.service;

import com.curso.dto.PostDto;
import com.curso.dto.PostDtoResponse;

public interface PostService {
	
	public PostDtoResponse save(PostDto obj);
	public PostDtoResponse getAll();
	public PostDtoResponse get(int id);
	public PostDtoResponse getByIdUser(int idUser);

}
