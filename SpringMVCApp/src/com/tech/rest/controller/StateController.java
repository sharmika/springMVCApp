package com.tech.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/state")
public class StateController {
	
	// get log4j handler
		private static final Logger logger = Logger
				.getLogger(StateController.class);

	@RequestMapping(value = "/{code}", method = RequestMethod.GET)
	public  @ResponseBody String getState(@PathVariable String code) {
		String result;
		if (code.equals("KL")) {
			result = "Kerala";
		} else {
			result = "Default State";
		}
		return result;
	}
	@RequestMapping(value = "/movie/{name}", method = RequestMethod.GET)
	public @ResponseBody String getMovie(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("movie", name);
		return name;
 
	}
 
	@RequestMapping(value = "id/{id}", method = RequestMethod.GET)
	public @ResponseBody String getDefaultMovie(ModelMap model) {
 
		String message= "this is default movie";
		String data="{ \"firstName\":\"John\" , \"lastName\":\"Doe\" }";
		return data;
 
	}
	/*@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public  @ResponseBody String getName(@PathVariable String name) {
		String message="hello.."+name;
		return message;
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public  @ResponseBody Long getId(@PathVariable Long id) {
	  
		return id;
	}*/
}
