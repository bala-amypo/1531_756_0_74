package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;

public class LocationServiceImpl implements LocationService {
    @Autowired
    LocationRepository locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le){
        return locationrepo.save(le);
    }
    
}