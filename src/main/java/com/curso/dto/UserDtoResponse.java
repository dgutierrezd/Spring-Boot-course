package com.curso.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDtoResponse {
	List<UserDto> listaDto;

	public UserDtoResponse() {
		super();
		listaDto = new ArrayList<UserDto>();
	}
	
	public List<UserDto> getListaDto() {
		return listaDto;
	}
	
	public void setListaDto(List<UserDto> listaDto) {
		this.listaDto = listaDto;
	}
	
	public void addListaDto(UserDto userDto) {
		this.listaDto.add(userDto);
	}
	

}
