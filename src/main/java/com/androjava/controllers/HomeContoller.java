package com.androjava.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.androjava.service.UserServerImp;

@Controller
public class HomeContoller {
	
@RequestMapping(value = "/",method = RequestMethod.GET)	
public String homePage(Model model)
{
	model.addAttribute("title", "Login page");	 
	return "index";
}


@GetMapping(value = "/register")	
public String registerpage(Model model)
{
	model.addAttribute("title", "Register page");	 
	return "registerPage";
}

 



	
	
}
