package com.geolocation.georest.vo;

import dev.morphia.geo.Point;
import lombok.Data;

@Data
public class AddressRequest {

	private Point address;
}
