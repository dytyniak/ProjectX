package ua.com.projectx.service;

import java.util.List;

import ua.com.projectx.entity.Route;

public interface RouteService {
	List<Route> findByName(String name);

    List<Route> findAll();

    List<Route> findByDirectorUsername(String directorName);
}

