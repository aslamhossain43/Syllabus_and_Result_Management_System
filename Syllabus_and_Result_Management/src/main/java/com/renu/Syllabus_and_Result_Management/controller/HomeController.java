package com.renu.Syllabus_and_Result_Management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.renu.Syllabus_and_Result_Management.repository.FacultyRepository;

@Controller
public class HomeController {
	      private static final Logger LOGGER=LoggerFactory.getLogger(HomeController.class);
	@Autowired
      private FacultyRepository facultyRepository;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showHome() {
		LOGGER.debug("Rendering from ShowHome Method");
		return "home";
	}
	
	
}
