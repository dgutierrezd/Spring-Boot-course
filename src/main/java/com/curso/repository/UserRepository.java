package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}