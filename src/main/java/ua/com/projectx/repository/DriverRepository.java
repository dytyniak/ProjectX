package ua.com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.com.projectx.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
    Driver findByUsername(String username);
}
