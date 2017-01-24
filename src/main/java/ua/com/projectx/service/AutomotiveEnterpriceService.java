package ua.com.projectx.service;

import ua.com.projectx.entity.AutomotiveEnterprice;
import ua.com.projectx.entity.Director;

public interface AutomotiveEnterpriceService {
    AutomotiveEnterprice findByDirector(Director director);
}
