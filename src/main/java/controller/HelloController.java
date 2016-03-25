package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import entity.User;

@RestController
public class HelloController {

    @RequestMapping(value = "/getUser")
    public User getUser() {
        System.out.println("I am here!");
        User user = new User();
        user.setUsername("dytyniak");
        user.setPassword("123123123");
        return user;
    }

    @RequestMapping(value = "/")
    public ModelAndView printWelcome() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

}