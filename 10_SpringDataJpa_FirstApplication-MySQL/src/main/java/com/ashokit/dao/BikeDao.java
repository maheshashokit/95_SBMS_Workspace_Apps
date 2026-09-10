package com.ashokit.dao;

import com.ashokit.entity.Bike;
import org.springframework.data.repository.CrudRepository;

public interface BikeDao extends CrudRepository<Bike, Integer> {
}
