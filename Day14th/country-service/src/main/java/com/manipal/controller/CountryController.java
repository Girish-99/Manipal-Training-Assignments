package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Capital;
import com.manipal.model.Coun;
import com.manipal.model.Country;
import com.manipal.proxy.CapitalFinderProxy;
import com.manipal.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@Autowired 
	CapitalFinderProxy proxy;
	@GetMapping("country-service/country/{countryName}")
	public Country getCountry(@PathVariable String countryName) {
//		
//		Capital capital=new Capital("123", "Delhi", "Hindi", 12346L, "123", 9000);
//		Coun coun= countryService.getCountryDetails(countryName);
//		Country country= new Country(coun.getCountryCode(), coun.getCountryName(), capital);
//		return country;
		
		Coun coun= countryService.getCountryDetails(countryName);
		Capital capital=proxy.getCapitalDetails("Delhi");
		System.out.println("==============================");
		System.out.println(capital);
		System.out.println("==========================");
		Country country= new Country(coun.getCountryCode(), coun.getCountryName(), capital);
		return country;
	}

}
