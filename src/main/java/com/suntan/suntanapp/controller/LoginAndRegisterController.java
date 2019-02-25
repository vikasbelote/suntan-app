package com.suntan.suntanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.suntan.suntanapp.dto.RegisterDTO;
import com.suntan.suntanapp.service.UserService;

@Controller
public class LoginAndRegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView login() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("login");
    	return model;
    }
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {    	
    	return new ModelAndView("register", "registerDTO",  new RegisterDTO());
    }
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPost(@ModelAttribute("registerDTO")  RegisterDTO registerDTO) {
		userService.registerUser(registerDTO);
		return "redirect:/";
    }

}
