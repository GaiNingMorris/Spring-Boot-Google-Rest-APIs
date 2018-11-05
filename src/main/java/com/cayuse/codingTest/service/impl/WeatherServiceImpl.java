package com.cayuse.codingTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cayuse.codingTest.domain.Utils;
import com.cayuse.codingTest.domain.WeatherResponse;
import com.cayuse.codingTest.service.WeatherService;

/**
 * Weather Service Impl
 * @author ningm
 *
 */
@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * get weather informations by zipcode
	 * @param zipCode zipCode
	 * @return WeatherResponse
	 */
	public WeatherResponse getWeatherByzipCode(String zipCode) {
		return restTemplate.getForObject(Utils.WEATHER_API, 
				WeatherResponse.class, zipCode);
	}
}