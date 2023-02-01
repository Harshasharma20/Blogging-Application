package com.bloggingappcatogery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIcontroller {

	
	@RequestMapping("/blooging.com")
	public String welcomePage() {
		
		
		
		
		return"first_page";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		
		
		
		return"login";
	
	
	}
	
	
	
	
	
}
