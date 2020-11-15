package com.geolocation.georest.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geolocation.georest.model.Partner;
import com.geolocation.georest.repository.PartnerRepository;
import com.geolocation.georest.service.PartnerService;

import dev.morphia.geo.Point;

@Service
@Transactional
public class PartnerServiceImpl implements PartnerService {

	@Autowired
	private PartnerRepository partnerRepository;
	
	@Override
	public Partner createPartner(Partner partner) {		
		return partnerRepository.save(partner);
	}
	
	@Override
	public Partner findByPartnerId(Long id) {
		return partnerRepository.findById(id).get();
	}

	@Override
	public Partner searchNearestPartner(Point longLat) {
		return partnerRepository.findByAddressNear(longLat, new Distance(1.0, Metrics.KILOMETERS));
	}	

}
