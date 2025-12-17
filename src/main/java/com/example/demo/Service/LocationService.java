package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.LocationEntity;
@Service
public interface LocationService {
    LocationEntity createlocation(LocationEntity location);
    List<LocationEntity> getalllocation();
}
