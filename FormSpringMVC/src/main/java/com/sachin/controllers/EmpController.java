package com.sachin.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sachin.beans.Employee;
import com.sachin.dao.EmpDao;

@Controller
public class EmpController {
	@Autowired
	EmpDao empDao;

	@RequestMapping("/empform")
	public ModelAndView showForm() {
		return new ModelAndView("empform", "command", new Employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Employee emp) {
		// list.add(new Employee(emp.getName(), emp.getSalary(),
		// emp.getDesignation()));
		empDao.save(emp);
		return new ModelAndView("redirect:/viewemp");
	}

	@RequestMapping("/viewemp")
	public ModelAndView viewEmp() {
		List<Employee> list = new ArrayList<Employee>();
		list = empDao.getEmployees();
		return new ModelAndView("viewemp", "list", list);
	}

}
