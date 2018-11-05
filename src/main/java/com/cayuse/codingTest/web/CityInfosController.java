package com.cayuse.codingTest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cayuse.codingTest.domain.CityInfos;
import com.cayuse.codingTest.domain.Utils;
import com.cayuse.codingTest.service.CityInfosService;

/**
 * CityInfos Controller
 * @author ningm
 *
 */
@Controller
public class CityInfosController {

	@Autowired
	private CityInfosService cityInfoService;

	/**
	 * login
	 * @return String
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	/**
	 * get city informations by zipcode
	 * @param model model
	 * @param zipCode zipcode
	 * @return String
	 */
	@RequestMapping(value = "/getCityInfos", method = RequestMethod.POST)
	public String getCityInfo(Model model, @RequestParam(name = "zipCode") String zipCode) {
		if (!Utils.isFiveNumber(zipCode)) {
			//if zipcode is invalid, then return error information
			model.addAttribute("error", "zipcode is invalid");
		} else {
			CityInfos cityInfos = cityInfoService.getCityInfos(zipCode);
			
			if (cityInfos != null) {
				model.addAttribute("cityInfos", cityInfos);
			} else {
				// it is five number, but it is not real zipcode
				model.addAttribute("error", "zipcode is invalid");
			}
		}

		return "login";
	}
}