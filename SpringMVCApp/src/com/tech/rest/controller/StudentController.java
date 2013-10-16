package com.tech.rest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.tech.rest.bo.StudentBO;
import com.tech.rest.model.Student;
import org.slf4j.LoggerFactory;

@Controller
public class StudentController {

	// get log4j handler
	private static final Logger logger = Logger
			.getLogger(StudentController.class);
	private Logger timeLogger = Logger.getLogger("timerLogger123");
	@Autowired
	StudentBO studentBO;

	/*
	 * this method is for inserting student values into database
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String insertDetails(
			@ModelAttribute("registration") Student student, ModelMap model,
			HttpServletRequest request, HttpServletResponse response) {

		System.out.println("in controller");
		try {
			
			
			studentBO.insertDetails(student);
		} catch (Exception e) {
			timeLogger.info("slf4j................");
			logger.info("error occuring while inserting details into database");
		}

		return "result";

	}

	/*
	 * @RequestMapping(value = "/register", method = RequestMethod.GET) public
	 * String insertDetails1(ModelMap model, HttpServletRequest request,
	 * HttpServletResponse response) { Student std=new Student();
	 * model.addAttribute("registration", std);
	 * System.out.println("in controller test"); return "test";
	 * 
	 * }
	 */
}
