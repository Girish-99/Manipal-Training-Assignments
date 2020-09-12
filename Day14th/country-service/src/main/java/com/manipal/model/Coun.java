package com.manipal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Coun {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="country_code")
	private String countryCode;
	@Column(name="country_name")
	private String countryName;
	  
	  public Coun() { }
	  
	public Coun(String countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Coun [countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}
	  
	  

}
