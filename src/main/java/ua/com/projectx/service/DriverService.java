package ua.com.projectx.service;

import java.util.List;

import ua.com.projectx.entity.Driver;

public interface DriverService {
	List<Driver> findAll();

	Driver findByUsername(String username);
}
