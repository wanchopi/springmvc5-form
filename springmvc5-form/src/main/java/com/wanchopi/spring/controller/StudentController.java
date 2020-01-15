package com.wanchopi.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wanchopi.spring.model.Student;


/**
 * Spring MVC Controller
 * @author Wanchopi
 *
 */
@Controller
public class StudentController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Value("${countries}")
	private String countries;	// load field countries of properties
	
	@Value("${frameworks}")
	private String frameworks;	// load field frameworks of properties
	
	@ModelAttribute("countryList")
	public String[] loadCountries() {
		String[] items = this.countries.split(",");	// converts a comma-separated string into an array
		return items;	
	}
	
	@ModelAttribute("frameworkList")
	public String[] loadFrameworks() {
		String[] items = this.frameworks.split(","); // convers a comma-separated string into an array
		return items;
	}
	
	@GetMapping("/")
	public ModelAndView user() {
		logger.info("Returning form view");
		Student student = new Student();
		ModelAndView mav = new ModelAndView("index", "user", student);
		return mav;
	}
	

	@PostMapping("/save")
	public ModelAndView saveForm(@ModelAttribute("user") Student student) {
		logger.info("Returning success-form view");
		// Implement business logic to save user details into a database
		// ...
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("message", "Usuario registrado satisfactoriamente");
		myModel.put("user", student);
		
		ModelAndView mav = new ModelAndView("success", "model", myModel);
		
		return mav;
	}

}
