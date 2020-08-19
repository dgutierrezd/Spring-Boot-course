package com.curso.service;

import com.curso.dto.UserDto;
import com.curso.dto.UserDtoResponse;

public interface UserService {

	public UserDtoResponse register(UserDto user);
	public UserDtoResponse getAll();
	public UserDtoResponse get(int id);
}
