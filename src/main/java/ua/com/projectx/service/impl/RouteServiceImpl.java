package ua.com.projectx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.projectx.entity.AutomotiveEnterprice;
import ua.com.projectx.entity.Director;
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
        return routeRepository.findByAutomotiveEnterprice(automotiveEnterprice);
    }
}
