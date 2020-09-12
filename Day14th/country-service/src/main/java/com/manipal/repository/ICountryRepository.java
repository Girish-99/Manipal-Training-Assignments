package com.manipal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manipal.model.Coun;

@Repository
public interface ICountryRepository extends JpaRepository<Coun, String> {
	Coun findByCountryCode(String countryCode);
	Coun findByCountryName(String countryName);
}
