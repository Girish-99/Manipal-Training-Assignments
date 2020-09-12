package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Capi;
import com.manipal.model.Capital;

@Repository
public interface ICapitalServiceRepo extends JpaRepository<Capi, String>{
	Capi findByName(String name);
	Capi findByCountryCode(String countrycode);

}
