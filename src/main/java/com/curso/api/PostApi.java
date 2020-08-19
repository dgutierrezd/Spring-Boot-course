package com.curso.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.dto.PostDto;
import com.curso.dto.PostDtoResponse;
import com.curso.service.PostService;

@RestController
@RequestMapping(value = "/api/post")
public class PostApi {
	
	@Autowired
	PostService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public PostDtoResponse save(@RequestBody PostDto postDto) {
		return service.save(postDto);
	}
	
	@RequestMapping(value = "/all", produces = "application/json" ,method = RequestMethod.GET)
	public PostDtoResponse getAll() {
		return service.getAll();
	}
	
	@RequestMapping(value = "/{id}", produces = "application/json" ,method = RequestMethod.GET)
	public PostDtoResponse getOne(@PathVariable("id") int id) {
		return service.get(id);
	}
	
	@RequestMapping(value = "/user/{id}", produces = "application/json" ,method = RequestMethod.GET)
	public PostDtoResponse getByIdUser(@PathVariable("id") int idUser) {
		return service.getByIdUser(idUser);
	}

}
