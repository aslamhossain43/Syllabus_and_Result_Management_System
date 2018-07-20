package com.renu.Syllabus_and_Result_Management.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.renu.Syllabus_and_Result_Management.dto.ResultsDTO;
import com.renu.Syllabus_and_Result_Management.entity.D;
import com.renu.Syllabus_and_Result_Management.entity.F;
import com.renu.Syllabus_and_Result_Management.entity.Faculty;
import com.renu.Syllabus_and_Result_Management.repository.DRepository;
import com.renu.Syllabus_and_Result_Management.repository.FRepository;

@Controller
@RequestMapping(value = "/manage")
public class ManageController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ManageController.class);
       
	@Autowired
	private FRepository frepository;
	@Autowired
	private DRepository drepository;
	
	
	
	
	@RequestMapping(value = "/showFaculty", method = RequestMethod.GET)
	public String showFaculty(Model model) {
		LOGGER.debug("Rendering from Manage Faculty ");

		return "manage-faculty";

	}
    
	@RequestMapping(value = "/createFaculty", method = RequestMethod.POST)
	public String manageFaculty(@Valid  ResultsDTO resultsDTO,
			BindingResult bindingResult, WebRequest webRequest, RedirectAttributes redirectAttributes, Model model) {
		LOGGER.debug("Rendering from Manage Faculty ");
		F f=new F();
		f.setFaculty(webRequest.getParameter("faculty"));
		frepository.save(f);
		model.addAttribute("faculty", frepository.findAll());
		model.addAttribute("message", "Faculty has created !!!");
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", "Invalid Faculty Name");
			return "redirect:/manage/showFaculty";
		}
		return "manage-department";

	}
	
	
	
	@RequestMapping(value = "/createDepartment", method = RequestMethod.POST)
	public String manageDepartment(@Valid  ResultsDTO resultsDTO,
			BindingResult bindingResult, WebRequest webRequest, RedirectAttributes redirectAttributes, Model model) {
		LOGGER.debug("Rendering from Manage Department ");
		D d=new D();
		d.setDepartment(webRequest.getParameter("department"));
		d.setFaculty(webRequest.getParameter("faculty"));
        drepository.save(d);
        model.addAttribute("faculty", frepository.findAll());
		model.addAttribute("department",drepository.findAll());
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", "Invalid Department Name");
			return "redirect:/";
		}
		return "manage-l-s";

	}
	
	

}
