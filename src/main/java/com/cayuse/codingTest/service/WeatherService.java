package com.cayuse.codingTest.service;

import com.cayuse.codingTest.domain.WeatherResponse;

public interface WeatherService {

	public WeatherResponse getWeatherByzipCode(String zipCode);
}
