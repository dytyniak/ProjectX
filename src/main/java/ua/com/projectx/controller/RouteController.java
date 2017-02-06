package ua.com.projectx.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.com.projectx.entity.Driver;
import ua.com.projectx.entity.Route;
import ua.com.projectx.service.RouteService;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = {"http://localhost:3000", "http://192.168.137.46"})
@ComponentScan(basePackages = { "ua.com.projectx.service" })
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@RequestMapping(value = "/route/{name}")
	public List<Route> getRoute(@PathVariable String name) {
		return routeService.findByName(name);
	}

	@RequestMapping(value = "/routeByDirector/{directorUsername}")
	public List<Route> getRouteByDirector(@PathVariable String directorUsername, HttpServletRequest httpRequest) throws IOException {
		return routeService.findByDirectorUsername(directorUsername);
	}

}