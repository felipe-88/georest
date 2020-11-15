package com.geolocation.georest.repository;

import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.geolocation.georest.model.Partner;

import dev.morphia.geo.Point;

public interface PartnerRepository extends MongoRepository<Partner, Long> {
	
	public List<Partner> findByLocationNear(Point location, Distance distance);
	
	public Partner findByAddressNear(Point location, Distance distance);
}
