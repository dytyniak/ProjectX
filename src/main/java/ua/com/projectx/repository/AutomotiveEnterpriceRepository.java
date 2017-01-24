package ua.com.projectx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.com.projectx.entity.AutomotiveEnterprice;
import ua.com.projectx.entity.Director;

@Repository
public interface AutomotiveEnterpriceRepository extends JpaRepository<AutomotiveEnterprice, Integer> {
    AutomotiveEnterprice findByDirector(Director director);
}
