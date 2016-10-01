package com.kirioslab.heftyfish.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirioslab.heftyfish.model.Author;
import com.kirioslab.heftyfish.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public Optional<Author> getAuthorByEmail(String email) {
		return authorRepository.findByEmail(email);
	}
}
