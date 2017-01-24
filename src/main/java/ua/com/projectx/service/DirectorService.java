package ua.com.projectx.service;

import java.util.List;

import ua.com.projectx.entity.Director;

public interface DirectorService {
	List<Director> findAll();
	Director findByUsernameAndPassword(String username, String password);
	Director findByUsername(String username);

    void save(Director director);
}
