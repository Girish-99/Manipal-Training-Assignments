package com.manipal.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.manipal.model.Capital;



@FeignClient(name="capital-service", url="localhost:8051")
//@RibbonClient(name="capital-service")
public interface CapitalFinderProxy {
	
	@GetMapping(name="capital-service/capital/{name}")
	public Capital getCapitalDetails(@PathVariable String name);

}
