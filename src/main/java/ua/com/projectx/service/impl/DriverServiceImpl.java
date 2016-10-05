package ua.com.projectx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.projectx.entity.Driver;
import ua.com.projectx.repository.DriverRepository;
import ua.com.projectx.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	private DriverRepository driverRepository;
	
	@Override
	public List<Driver> findAll() {
		return driverRepository.findAll();
	}

}
