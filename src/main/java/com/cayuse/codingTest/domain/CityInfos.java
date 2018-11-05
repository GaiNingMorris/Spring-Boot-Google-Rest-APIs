package com.cayuse.codingTest.domain;

import java.io.Serializable;

public class CityInfos implements Serializable {

	private static final long serialVersionUID = -1860623992504475278L;

	// city name
	private String cityName;
	
	// temperature
	private String temperature;
	
	// time zone
	private String timezone;
	
	// elevation
	private String elevation;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	@Override
	public String toString() {
		return "CityInfos [cityName=" + cityName + ", temperature=" + temperature + ", timezone=" + timezone
				+ ", elevation=" + elevation + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}