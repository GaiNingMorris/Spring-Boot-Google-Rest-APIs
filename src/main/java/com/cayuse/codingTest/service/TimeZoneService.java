package com.cayuse.codingTest.service;

import com.cayuse.codingTest.model.TimeZoneResponse;

public interface TimeZoneService {

	public TimeZoneResponse getTimeZoneByLocation(String lat, String lon);
}
