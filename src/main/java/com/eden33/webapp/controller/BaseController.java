package com.eden33.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

	//TODO: update Maven dependencies
	
	@RequestMapping(value="/welcome", method= RequestMethod.GET)	
	public String welcome(ModelMap model) {
		model.addAttribute("message", "Maven Dynamic Web Project + Spring 3 MVC - welcome()");

		return "index";
	}
	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
		model.addAttribute("message", "Maven Dynamic Web Project + Spring 3 MVC - " + name);

		return "index";
	}
}
