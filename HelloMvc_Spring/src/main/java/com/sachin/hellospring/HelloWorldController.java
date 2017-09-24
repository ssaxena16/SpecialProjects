package com.sachin.hellospring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if ("password".equals(password)) {
			String message = "HELLO " + name;
			return new ModelAndView("hellopage", "message", message);
		} else {
			String erroemsg = "Sorry User or Password is wrong ";
			return new ModelAndView("errorpage", "message", erroemsg);
		}

	}

}
