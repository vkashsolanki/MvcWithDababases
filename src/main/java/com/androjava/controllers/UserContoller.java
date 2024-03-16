package com.androjava.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
 
import com.androjava.model.UserModel;
import com.androjava.repository.UserRepository;
import com.androjava.service.UserServerImp;
import com.androjava.service.UserService;

@Controller
public class UserContoller {
	 
	
 	
	@PostMapping(value = "/doRegister")
	public String registerUser(@ModelAttribute UserModel userModel)
	{
		
		UserServerImp service=new UserServerImp();		
		//System.out.println(service);
	     service.saveUser(userModel);
		
	
		return "redirect:/";	
	}
	
	
}
