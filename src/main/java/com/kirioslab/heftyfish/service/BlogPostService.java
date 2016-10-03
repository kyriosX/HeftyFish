package com.kirioslab.heftyfish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirioslab.heftyfish.dto.BlogPostDto;
import com.kirioslab.heftyfish.model.BlogPost;
import com.kirioslab.heftyfish.model.BlogPostHeader;
import com.kirioslab.heftyfish.repository.BlogPostRepository;

@Service
public class BlogPostService {

	@Autowired
	private BlogPostRepository blogPostRepository;
	
	public BlogPostHeader getLatestPost() throws NoBlogPostFoundException {
		return blogPostRepository.findFirstByOrderByPublishDateDesc()
				.orElseThrow(() -> new NoBlogPostFoundException());
	}
	
	public List<BlogPostHeader> getLatest5Posts() {
		return blogPostRepository.findTop5ByOrderByPublishDateDesc();
	}

	public void create(BlogPostDto blogPost) {
		BlogPostHeader bh = new BlogPostHeader(blogPost);
		BlogPost bp = new BlogPost(blogPost);
		bh.setBlogPost(bp);
		bp.setBlogPostHeader(bh);
		
		blogPostRepository.save(bh);
	}
	
}
