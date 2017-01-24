package ua.com.projectx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.com.projectx.entity.Director;
import ua.com.projectx.service.DirectorService;


@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://192.168.137.46"})
@ComponentScan(basePackages = { "ua.com.projectx.service" })
public class AuthenticationController {

	@Autowired
	private DirectorService directorService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean login(@RequestBody Director director) {
		System.out.println(director.getUsername() + " " + director.getPassword());
		return directorService.findByUsernameAndPassword(director.getUsername(), director.getPassword()) != null;
	}
/*
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public boolean register(@RequestBody Director director) {
		if (directorService.findByUsername(director.getUsername()) != null) {
			return true;
		}
		directorService.save(director);
		return false;
	}
*/
}