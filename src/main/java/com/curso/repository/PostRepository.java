package com.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
