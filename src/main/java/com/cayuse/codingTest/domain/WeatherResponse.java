package com.cayuse.codingTest.domain;

import java.io.Serializable;

/**
 * Weather Response
 * @author ningm
 *
 */
public class WeatherResponse implements Serializable {

	private static final long serialVersionUID = 382293836115586348L;

	// city name
	private String cityName;
	
	// longitude
	private String longitude;
	
	// latitude
	private String latitude;
	
	// temperature
	private String temperature;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "WeatherResponse [cityName=" + cityName + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", temperature=" + temperature + "]";
	}
}