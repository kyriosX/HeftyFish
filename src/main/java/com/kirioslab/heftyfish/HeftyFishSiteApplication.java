package com.kirioslab.heftyfish;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kirioslab.heftyfish.model.BlogPostHeader;
import com.kirioslab.heftyfish.service.BlogPostService;
import com.kirioslab.heftyfish.service.NoBlogPostFoundException;

@RestController
@SpringBootApplication
public class HeftyFishSiteApplication {

	@Autowired
	private BlogPostService blogPostService;
	
	public static void main(String[] args) {
		SpringApplication.run(HeftyFishSiteApplication.class, args);
	}

	@RequestMapping("/")
	ModelAndView home(ModelAndView mv) {
		mv.setViewName("index");
		List<BlogPostHeader> latestPosts = blogPostService.getLatest5Posts();
		BlogPostHeader latestPost = latestPosts.remove(0);
		
		mv.addObject("latestPost", latestPost);
		mv.addObject("latestPostList", latestPosts);
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	ModelAndView login(ModelAndView mv) {
		mv.setViewName("login");
		return mv;
	}
}
