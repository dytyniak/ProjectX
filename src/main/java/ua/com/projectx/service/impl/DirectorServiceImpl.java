package ua.com.projectx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.com.projectx.entity.Director;
import ua.com.projectx.repository.DirectorRepository;
import ua.com.projectx.service.DirectorService;

@Service
public class DirectorServiceImpl implements DirectorService{

	@Autowired
	private DirectorRepository directorRepository;
	
	@Override
	public List<Director> findAll() {
		return directorRepository.findAll();
	}

	@Override
	public Director findByUsernameAndPassword(String username, String password) {
		return directorRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public Director findByUsername(String username) {
		return directorRepository.findByUsername(username);
	}

}
