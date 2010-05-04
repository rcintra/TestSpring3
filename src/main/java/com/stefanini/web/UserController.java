package com.stefanini.web;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	 @RequestMapping(value = "/index", method = RequestMethod.GET)    
	 public String index(ModelMap modelMap) {    
		 return "index";        
	 }  
}