package com.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dto.UserDto;
import com.curso.dto.UserDtoResponse;
import com.curso.entities.User;
import com.curso.repository.UserRepository;
import com.curso.util.Mapeo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Autowired
	private Mapeo maper;
	
	public UserDtoResponse register(UserDto userDto) {
		User obj = new User();
		UserDtoResponse response = new UserDtoResponse();
		
		try {
			obj = (User)maper.convertToEntity(userDto, obj);
			obj = repository.save(obj);
			
			response.setListaDto(repository.getUserById(obj.getIdUser()));
		} catch (Exception e) {
			System.out.println("No se pudo crear el usuario");
		}
		
		return response;
	}
	
	public UserDtoResponse getAll() {
		UserDtoResponse response = new UserDtoResponse();
		
		try {
			response.setListaDto(repository.getAll());
		} catch (Exception e) {
			System.out.println("No se obtuvo datos");
		}
		
		return response;
	}
	
	public UserDtoResponse get(int id) {
		UserDtoResponse response = new UserDtoResponse();
		
		try {
			response.setListaDto(repository.getUserById(id));
		} catch (Exception e) {
			System.out.println("No existe");
		}
		
		return response;
	}
}
