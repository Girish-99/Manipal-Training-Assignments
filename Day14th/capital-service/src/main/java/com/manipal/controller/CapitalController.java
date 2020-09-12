package com.manipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.Capi;
import com.manipal.model.Capital;
import com.manipal.service.CapitalService;

@RestController
public class CapitalController {
	@Autowired
	private Environment environment;
	@Autowired
	CapitalService capitalService;
	
	@GetMapping(value="capital-service/capital/{name}")
	public Capital getCapital(@PathVariable String name) {
		
		Capi capi= capitalService.getCapitalByName(name);
		int port= Integer.parseInt(environment.getProperty("local.server.port"));
		return new Capital(capi.getZipcode(), capi.getName() ,capi.getLanguage(), capi.getPopulation(), capi.getCountryCode() , port);
		
	}
	
	@GetMapping(value="capital-service/capital/countrycode/{countrycode}")
	public Capital getCapitalByCountryCode(@PathVariable String countrycode) {
		
		Capi capi= capitalService.getByCountryCode(countrycode);
		int port= Integer.parseInt(environment.getProperty("local.server.port"));
		return new Capital(capi.getZipcode(), capi.getName() ,capi.getLanguage(), capi.getPopulation(), capi.getCountryCode() , port);
		
	}

}
