package com.cayuse.codingTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cayuse.codingTest.model.TimeZoneResponse;
import com.cayuse.codingTest.model.Utils;
import com.cayuse.codingTest.service.TimeZoneService;

/**
 * TimeZone Service Impl
 * @author ningm
 *
 */
@Service
public class TimeZoneServiceImpl implements TimeZoneService {

	@Autowired
	private RestTemplate restTemplate;

	/**
	 * get timezone by location
	 * @param lat latitude
	 * @param lon longitude
	 * @return TimeZoneResponse
	 */
	public TimeZoneResponse getTimeZoneByLocation(String lat, String lon) {
		return restTemplate.getForObject(Utils.TIME_ZONE_API, 
				TimeZoneResponse.class, lat, lon);
	}
}