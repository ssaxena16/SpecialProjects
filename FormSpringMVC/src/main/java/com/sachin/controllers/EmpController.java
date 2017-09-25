package com.sachin.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sachin.beans.Employee;

@Controller
public class EmpController {

	@RequestMapping("/empform")
	public ModelAndView showForm() {
		return new ModelAndView("empform", "command", new Employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
		// list.add(new Employee(emp.getName(), emp.getSalary(),
		// emp.getDesignation()));
		return new ModelAndView("redirect:/viewemp");
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewEmp() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Mohit", 20000, "softeare engineer"));
		list.add(new Employee("Rohit", 15000, "softeare engineer"));
		list.add(new Employee("Shobhit", 21000, "Sr. softeare engineer"));
		list.add(new Employee("SP", 25000, "Sr. softeare engineer"));
		return new ModelAndView("viewemp", "list", list);
	}

}
