package com.manipal.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentLoginController {
	
	@RequestMapping(value= "/loginForm", method= RequestMethod.GET )
	public String loginForm() {
		return "LoginForm";
	}

	@RequestMapping(value="/submit", method= RequestMethod.GET)
	public ModelAndView SubmitForm(@RequestParam String studentName , @RequestParam String studentPassword) {
		ModelAndView modelAndView;
		if(studentName== "admin" && studentPassword == "admin123" ) {
			 modelAndView= new ModelAndView("welcomePage");
			 modelAndView.addObject("sName" , studentName);
		}else {
			 modelAndView= new ModelAndView("LoginForm");
		}
		return modelAndView;		
	}
	
}
