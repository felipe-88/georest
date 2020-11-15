package com.geolocation.georest.service;

import com.geolocation.georest.model.Partner;

import dev.morphia.geo.Point;

public interface PartnerService {

	public Partner createPartner(Partner partner);
	
	public Partner findByPartnerId(Long id);
	
	public Partner searchNearestPartner(Point longLat);
}
