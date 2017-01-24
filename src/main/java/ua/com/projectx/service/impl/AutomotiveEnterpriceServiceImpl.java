package ua.com.projectx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.projectx.entity.AutomotiveEnterprice;
import ua.com.projectx.entity.Director;
import ua.com.projectx.repository.AutomotiveEnterpriceRepository;
import ua.com.projectx.service.AutomotiveEnterpriceService;

@Service
public class AutomotiveEnterpriceServiceImpl implements AutomotiveEnterpriceService {

    @Autowired
    private AutomotiveEnterpriceRepository automotiveEnterpriceRepository;

    @Override
    public AutomotiveEnterprice findByDirector(Director director) {
        return automotiveEnterpriceRepository.findByDirector(director);
    }
}
