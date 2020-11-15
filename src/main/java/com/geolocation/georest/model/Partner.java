package com.geolocation.georest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import dev.morphia.annotations.Entity;
import dev.morphia.geo.MultiPolygon;
import dev.morphia.geo.Point;
import lombok.Data;

@Data
@Entity
@Document(collection = "partner")
public class Partner {
	
	@Id
	private Long id; 

	private String tradingName;
	
	private String ownerName;
	
	private String document;
	
	private MultiPolygon coverageArea;
	
	private Point address;
	
}
