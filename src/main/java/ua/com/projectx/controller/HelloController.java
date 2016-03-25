package ua.com.projectx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.com.projectx.entity.User;
import ua.com.projectx.service.UserService;

@RestController
@ComponentScan(basePackages = "ua.com.projectx.service")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUser")
    public User getUser() {
        return userService.findAll().get(0);
    }

    @RequestMapping(value = "/")
    public ModelAndView printWelcome() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}