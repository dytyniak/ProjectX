package ua.com.projectx.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.com.projectx.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {
	List<Route> findByName(String name);
}
