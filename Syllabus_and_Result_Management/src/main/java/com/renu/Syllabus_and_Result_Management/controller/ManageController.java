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

import com.renu.Syllabus_and_Result_Management.dto.FacultyDTO;
import com.renu.Syllabus_and_Result_Management.dto.ResultsDTO;
import com.renu.Syllabus_and_Result_Management.entity.D;
import com.renu.Syllabus_and_Result_Management.entity.F;
import com.renu.Syllabus_and_Result_Management.entity.Faculty;
import com.renu.Syllabus_and_Result_Management.repository.DRepository;
import com.renu.Syllabus_and_Result_Management.repository.FRepository;
import com.renu.Syllabus_and_Result_Management.repository.FacultyRepository;

@Controller
public class ManageController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ManageController.class);
       
	@Autowired
	private FRepository frepository;
	@Autowired
	private DRepository drepository;
	@Autowired
	private FacultyRepository facultyRepository;
	
	
	
	
	@RequestMapping(value = "/showFaculty", method = RequestMethod.GET)
	public String showFaculty(Model model) {
		LOGGER.debug("Rendering from Manage Faculty ");

		return "manage-faculty";

	}
    
	@RequestMapping(value = "/createFaculty", method = RequestMethod.POST)
	public String manageFaculty(@Valid FacultyDTO facultyDTO,BindingResult bindingResult, WebRequest webRequest, RedirectAttributes redirectAttributes,
			Model model) {
		LOGGER.debug("Rendering from Manage Faculty ");
		F f=new F();
		f.setFaculty(webRequest.getParameter("faculty"));
		frepository.save(f);
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", "Invalid Faculty Name");
			return "redirect:/createDepartment";
		}
		model.addAttribute("message", "Faculty has created !!!");
		return "manage-faculty";

	}
	
	@RequestMapping(value = "/showDepartment", method = RequestMethod.GET)
	public String showDepartment(Model model) {
		LOGGER.debug("Rendering from Manage Faculty ");
       model.addAttribute("faculty", frepository.findAll());
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
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", "Invalid Department Name");
			return "redirect:/showDepartment";
		}
		 model.addAttribute("faculty", frepository.findAll());
		model.addAttribute("message","Department has created !!!");
		return "redirect:/showDepartment";

	}
	
	
	
	
	@RequestMapping(value = "/showLS", method = RequestMethod.GET)
	public String showLS(Model model) {
		LOGGER.debug("Rendering from Manage Level Semester ");
		model.addAttribute("df", drepository.findAll());
      
		return "manage-l-s";

	}
	
	@RequestMapping(value = "/createLS", method = RequestMethod.POST)
	public String manageLS(@Valid  ResultsDTO resultsDTO,
			BindingResult bindingResult, WebRequest webRequest, RedirectAttributes redirectAttributes, Model model) {
		LOGGER.debug("Rendering from Manage Level Semester");
		Faculty faculty=new Faculty();
		faculty.setD_name(webRequest.getParameter("d_name"));
		faculty.setF_name(webRequest.getParameter("f_name"));
		faculty.setLevel(webRequest.getParameter("level"));
	 faculty.setSemester(webRequest.getParameter("semester"));
		faculty.setTotal_credit(webRequest.getParameter("total_credit"));
		facultyRepository.save(faculty);
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", "Operation has not successeded !!!");
			return "redirect:/showLS";
		}
		model.addAttribute("message","Syllabus has created !!!");
		return "redirect:/showLS";

	}
	
	
	
	
	
	
	

}
