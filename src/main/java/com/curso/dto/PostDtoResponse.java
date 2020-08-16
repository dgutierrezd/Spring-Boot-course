package com.curso.dto;

import java.util.ArrayList;
import java.util.List;

import com.curso.entities.Post;

public class PostDtoResponse {
	List<PostDto> listaDto;

	public PostDtoResponse() {
		super();
		listaDto = new ArrayList<PostDto>();
	}
	
	public List<PostDto> getListaDto() {
		return listaDto;
	}
	
	public void setListaDto(List<PostDto> listaDto) {
		this.listaDto = listaDto;
	}
	
	public void addListaDto(PostDto postDto) {
		this.listaDto.add(postDto);
	}
}
