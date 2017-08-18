package com.typicalSSM.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.typicalSSM.model.User;
import com.typicalSSM.service.UserService;

@Controller
@SessionAttributes("name")
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView loginIn(String phoneNum , String password) {
		ModelAndView mv = new ModelAndView("welcome");
		User existUser = userService.userLogin(phoneNum, password);
		if(existUser!=null) {
			mv.addObject("name", existUser.getName());
		}
		return mv;
	}
}
