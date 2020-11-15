package com.geolocation.georest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geolocation.georest.model.Partner;
import com.geolocation.georest.service.PartnerService;
import com.geolocation.georest.vo.AddressRequest;

@RestController
@RequestMapping("/api")
public class PartnerController {

	@Autowired
	private PartnerService partnerService;
	
	@GetMapping("/partner/{id}")
	public ResponseEntity<Partner> getPartnerById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<Partner>(partnerService.findByPartnerId(id), HttpStatus.OK);
	}
	
	@PostMapping("/partner/create")
	public ResponseEntity<Partner> createPartner(@RequestBody Partner newPartner) {
		
		return new ResponseEntity<Partner>(partnerService.createPartner(newPartner), HttpStatus.OK);
	}
	
	@PostMapping("/partner/search")
	public ResponseEntity<Partner> searchPartner(@RequestBody AddressRequest request) {
		
		return new ResponseEntity<Partner>(partnerService.searchNearestPartner(request.getAddress()), HttpStatus.OK);
	}
	
}
