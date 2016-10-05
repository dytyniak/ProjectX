package ua.com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.com.projectx.entity.Director;

@Repository
public interface DirectorRepository extends JpaRepository<Director, Integer> {
	Director findByUsernameAndPassword(String username, String password);
	Director findByUsername(String username);
}
