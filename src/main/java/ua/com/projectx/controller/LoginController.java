package ua.com.projectx.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.com.projectx.entity.User;

@Controller
@ComponentScan("ua.com.jobsukraine.service")
public class LoginController {

	@RequestMapping(value = "/login")
	public ModelAndView goLogin() {
		ModelAndView model = new ModelAndView("login");
		model.addObject("loginForm", new User());
		return model;
	}

}