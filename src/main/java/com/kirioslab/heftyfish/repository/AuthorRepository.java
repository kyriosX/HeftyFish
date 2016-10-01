package com.kirioslab.heftyfish.repository;

import org.springframework.stereotype.Repository;

import com.kirioslab.heftyfish.model.Author;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>{
	
	Optional<Author> findByEmail(String email);
	
}
