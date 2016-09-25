package com.kirioslab.heftyfish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@SpringBootApplication
public class HeftyFishSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeftyFishSiteApplication.class, args);
	}

	@RequestMapping("/")
	ModelAndView home(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
}
