package com.curso.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.dto.UserDto;
import com.curso.dto.UserDtoResponse;
import com.curso.service.UserService;

@RestController
@RequestMapping(value = "/api/user")
public class UserApi {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value = "/register", produces = "application/json", method = RequestMethod.POST)
	public UserDtoResponse register(@RequestBody UserDto userDto) {
		return service.register(userDto);
	}
	
	@RequestMapping(value = "/all", produces = "application/json", method = RequestMethod.GET)
	public UserDtoResponse getAll() {
		return service.getAll();
	}
	
	@RequestMapping(value = "/{id}", produces = "application/json", method = RequestMethod.GET)
	public UserDtoResponse getOne(@PathVariable("id") int id) {
		return service.get(id);
	}
}
