package com.ajaythankiah.web.personalwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String welcomePage() {
		//return "welcome";
		return "index.html";
	}

}
