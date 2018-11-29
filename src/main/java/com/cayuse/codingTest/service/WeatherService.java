package com.cayuse.codingTest.service;

import com.cayuse.codingTest.model.WeatherResponse;

public interface WeatherService {

	public WeatherResponse getWeatherByzipCode(String zipCode);
}
