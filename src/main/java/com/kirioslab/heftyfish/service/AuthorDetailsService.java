package com.kirioslab.heftyfish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kirioslab.heftyfish.dto.AuthorDetails;
import com.kirioslab.heftyfish.model.Author;

@Service
public class AuthorDetailsService implements UserDetailsService{

	@Autowired
	private AuthorService authorService;
	
	@Override
	public AuthorDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Author author = authorService.getAuthorByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User with email " + email + " not found."));
		
		return new AuthorDetails(author);
	}

}
