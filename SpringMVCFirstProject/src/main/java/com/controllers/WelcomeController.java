package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.Services.LoginServices;


@Controller
public class WelcomeController {
	@Autowired
	private LoginServices ls;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(){
		
		return "Login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String welcome(@RequestParam String name,@RequestParam String password, ModelMap model){
		
		if(ls.validateUser(name, password)){
		model.put("name", name);
		return "Welcome";
		}
		return "Login";
	}
}
