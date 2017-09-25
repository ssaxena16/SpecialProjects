package com.sachin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sachin.beans.Employee;

@Controller
public class EmpController {
	
	@RequestMapping("/empform")
	public ModelAndView showForm()
	{
		return new ModelAndView("empform","command",new Employee());
	}

}
