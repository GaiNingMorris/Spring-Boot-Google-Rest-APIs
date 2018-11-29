package com.cayuse.codingTest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cayuse.codingTest.model.CityInfos;
import com.cayuse.codingTest.model.TimeZoneResponse;
import com.cayuse.codingTest.model.WeatherResponse;
import com.cayuse.codingTest.service.CityInfosService;
import com.cayuse.codingTest.service.ElevationService;
import com.cayuse.codingTest.service.TimeZoneService;
import com.cayuse.codingTest.service.WeatherService;

/**
 * City Informations Service Impl
 * @author ningm
 *
 */
@Service
public class CityInfosServiceImpl implements CityInfosService {

	@Autowired
	private WeatherService weatherService;

	@Autowired
	private TimeZoneService timeZoneService;
	
	@Autowired
	private ElevationService elevationService;
	
	// dot .
	private final String DOT = ".";
	
	// fahrenheit flag
	private final String FAHRENHEIT = "F";
	
	// ""
	private final String STRING_EMPTY = "";

	// 0
	private final int NUMBER_ZERO = 0;

	/**
	 * get city informations by zipcode
	 * @param zipCode zipCode
	 * @return CityInfos
	 */
	public CityInfos getCityInfos(String zipCode) {
		CityInfos cityInfos = new CityInfos();

		// retrieve city name and tempreture from openweather api
		WeatherResponse weather = weatherService.getWeatherByzipCode(zipCode);
		if(weather == null) {
			return null;
		}
		cityInfos.setCityName(weather.getCityName());
		// only leave temperature`s integer
		cityInfos.setTemperature(weather.getTemperature().substring(NUMBER_ZERO, 
				weather.getTemperature().indexOf(DOT)) + FAHRENHEIT);

		// retrieve time zone from google api
		TimeZoneResponse timeZone = timeZoneService.getTimeZoneByLocation(
				weather.getLatitude(), weather.getLongitude());
		cityInfos.setTimezone(timeZone.getTimeZoneName());

		// retrieve elevation from google api
		String elevation = elevationService.getElevationByLocation(
				weather.getLatitude(), weather.getLongitude());
		
		if(elevation.equals(STRING_EMPTY)) {
			cityInfos.setElevation(STRING_EMPTY);
		} else {
			// only leave elevation`s integer
			cityInfos.setElevation(elevation.substring(NUMBER_ZERO, 
					elevation.indexOf(DOT)));
		}

		return cityInfos;
	}

}