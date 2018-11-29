package com.cayuse.codingTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cayuse.codingTest.model.Utils;
import com.cayuse.codingTest.service.ElevationService;

/**
 * Elevation Service Impl
 * 
 * @author ningm
 *
 */
@Service
public class ElevationServiceImpl implements ElevationService {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * get elevation information by location
	 * 
	 * @param lat
	 *            latitude
	 * @param lon
	 *            longitude
	 * @return String
	 */
	public String getElevationByLocation(String lat, String lon) {
		return restTemplate.getForObject(Utils.ELEVATION_API, String.class, lat, lon);
	}
}