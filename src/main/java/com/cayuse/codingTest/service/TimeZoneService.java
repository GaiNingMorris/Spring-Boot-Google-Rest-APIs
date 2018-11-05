package com.cayuse.codingTest.service;

import com.cayuse.codingTest.domain.TimeZoneResponse;

public interface TimeZoneService {

	public TimeZoneResponse getTimeZoneByLocation(String lat, String lon);
}
