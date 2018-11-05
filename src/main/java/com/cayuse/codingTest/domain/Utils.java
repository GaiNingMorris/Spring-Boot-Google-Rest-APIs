package com.cayuse.codingTest.domain;

import java.time.Instant;
import java.util.regex.Pattern;

/**
 * Common Util
 * 
 * @author ningm
 *
 */
public class Utils {

	private static long timestamp = Instant.now().getEpochSecond();

	// OpenWeatherMap API key
	public static final String WEATHER_API_KEY = "1812049a157d45de8a796cbeafd7628d";

	// google API key
	public static final String GOOGLE_API_KEY = "AIzaSyBBsl9TzdKHZT4SCQsrzh6nCB7TobwGgRo";

	// OpenWeatherMap API
	public static final String WEATHER_API = "http://api.openweathermap.org/data/2.5/weather?zip={},us&appid="
			+ WEATHER_API_KEY;

	// elevation API
	public static final String ELEVATION_API = "https://maps.googleapis.com/maps/api/elevation/json?location={},{}&key="
			+ GOOGLE_API_KEY;

	// timeZone API
	public static final String TIME_ZONE_API = "https://maps.googleapis.com/maps/api/timezone/json?location={},{}&timestamp="
			+ timestamp + "&key=" + GOOGLE_API_KEY;

	public static final float subtract = 273.15f;

	public static final int add = 32;

	public static final float ratio = 9 / 5;

	/**
	 * check if zipcode is 5 length number
	 * 
	 * @param zipCode
	 *            zipCode
	 * @return boolean
	 */
	public static boolean isFiveNumber(String zipCode) {
		Pattern pattern = Pattern.compile("^\\d{5}$");
		return pattern.matcher(zipCode).matches();
	}

	/**
	 * convert kelvin to fahrenheit (K − 273.15) × 9/5 + 32
	 * 
	 * @param kelvin
	 * @return String
	 */
	public static String convertKelvinToFahrenheit(String kelvin) {
		float fahrenheit = 0.0f;
		fahrenheit = (Float.parseFloat(kelvin) - subtract) * ratio + add;

		return String.valueOf(fahrenheit);
	}
}