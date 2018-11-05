package com.cayuse.codingTest.service;

import com.cayuse.codingTest.domain.CityInfos;

public interface CityInfosService {

	public CityInfos getCityInfos(String zipCode);
}
