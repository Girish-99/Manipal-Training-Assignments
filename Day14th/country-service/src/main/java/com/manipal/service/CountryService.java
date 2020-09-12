package com.manipal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manipal.model.Coun;
import com.manipal.repository.ICountryRepository;

@Service
public class CountryService {
	
	@Autowired
	ICountryRepository repository;
	public Coun getCountryCapital( String countryCode) {
		Coun coun = repository.findByCountryCode(countryCode);
		return coun;
	}
	
	public Coun getCountryDetails( String countryName) {
		Coun coun = repository.findByCountryName(countryName);
		return coun;
	}

}
