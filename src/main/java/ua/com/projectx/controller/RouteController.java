package ua.com.projectx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.com.projectx.entity.Route;
import ua.com.projectx.service.RouteService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://192.168.137.46"})
@ComponentScan(basePackages = { "ua.com.projectx.service" })
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@RequestMapping(value = "/route/{name}")
	public List<Route> getDrivers(@PathVariable String name) {
		return routeService.findByName(name);
	}
}