package ua.com.projectx.service.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import ua.com.projectx.entity.AutomotiveEnterprice;
import ua.com.projectx.entity.Director;
import ua.com.projectx.entity.Driver;
import ua.com.projectx.entity.Route;
import ua.com.projectx.repository.RouteRepository;
import ua.com.projectx.service.AutomotiveEnterpriceService;
import ua.com.projectx.service.DirectorService;
import ua.com.projectx.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	private RouteRepository routeRepository;

    @Autowired
    private DirectorService directorService;

    @Autowired
    private AutomotiveEnterpriceService automotiveEnterpriceService;
	
	@Override
	public List<Route> findByName(String name) {
		return routeRepository.findByName(name);
	}

    @Override
    public List<Route> findAll() {
        return routeRepository.findAll();
    }

    @Override
    public List<Route> findByDirectorUsername(String directorUsername) {
        Director director = directorService.findByUsername(directorUsername);
        AutomotiveEnterprice automotiveEnterprice = director.getAutomotiveEnterprice();
        List<Route> routes = routeRepository.findByAutomotiveEnterprice(automotiveEnterprice);
        routes.forEach(r->r.getDrivers().forEach(this::populateImage));
        return routes;
    }

    private void populateImage(Driver driver) {
        try {
            Resource res = new ClassPathResource("/assets/images/"+ driver.getUsername() + ".png");
            Path path = res.exists() ? res.getFile().toPath() : new ClassPathResource("/assets/images/default.png").getFile().toPath();
            driver.setImage(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
