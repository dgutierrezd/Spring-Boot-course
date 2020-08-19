package com.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dto.PostDto;
import com.curso.dto.PostDtoResponse;
import com.curso.entities.Post;
import com.curso.repository.PostRepository;
import com.curso.util.Mapeo;

@Service
public class PostServiceImpl implements PostService {
	
	@Autowired
	PostRepository repository;
	
	@Autowired
	private Mapeo maper;

	@Override
	public PostDtoResponse save(PostDto objDto) {
		Post obj = new Post();
		PostDtoResponse response = new PostDtoResponse();
		
		try {
			obj = (Post)maper.convertToEntity(objDto, obj);
			obj = repository.save(obj);
			response.setListaDto(repository.get(obj.getIdPost()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return response;
	}

	@Override
	public PostDtoResponse getAll() {
		PostDtoResponse response = new PostDtoResponse();
		
		try {
			response.setListaDto(repository.getAll());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return response;
	}

	@Override
	public PostDtoResponse get(int id) {
		PostDtoResponse response = new PostDtoResponse();
		
		try {
			response.setListaDto(repository.get(id));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return response;
	}

	@Override
	public PostDtoResponse getByIdUser(int idUser) {
		PostDtoResponse response = new PostDtoResponse();
		
		try {
			response.setListaDto(repository.getByUser(idUser));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return response;
	}

}
