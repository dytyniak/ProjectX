package ua.com.projectx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.com.projectx.entity.User;
import ua.com.projectx.service.UserService;

@RestController
@CrossOrigin
@ComponentScan(basePackages={"ua.com.projectx.service"})
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUsers")
    public List<User> getUsers() {	
        return userService.findAll();
    }
    
    

}