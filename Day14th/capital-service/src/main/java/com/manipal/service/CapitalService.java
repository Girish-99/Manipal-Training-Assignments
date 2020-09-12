package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Capi;
import com.manipal.model.Capital;
import com.manipal.repository.ICapitalServiceRepo;


@Service
public class CapitalService implements ICapitalService {
	
	@Autowired
	private ICapitalServiceRepo repository;
	
	public Capi getCapitalByName(String name) {
	Capi capi=repository.findByName(name);
	return capi;
	}
	
	public Capi getByCountryCode(String countrycode) {
		Capi capi= repository.findByCountryCode(countrycode);
		return capi;
	}

}
