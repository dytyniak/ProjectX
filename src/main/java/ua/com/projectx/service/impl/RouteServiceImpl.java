package ua.com.projectx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.projectx.entity.Route;
import ua.com.projectx.repository.RouteRepository;
import ua.com.projectx.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	private RouteRepository routeRepository;
	
	@Override
	public List<Route> findByName(String name) {
		return routeRepository.findByName(name);
	}
}
