package com.mindtree.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WorldController {
	
	@RequestMapping(value = "/showGreeting", method = RequestMethod.GET)
	public String showEmployeeForm(Model model){
		
		String greeting = "Hello World";
		model.addAttribute("greeting", greeting);
		
		String viewName = "greeting";
		
		return viewName;
		
	}
}
