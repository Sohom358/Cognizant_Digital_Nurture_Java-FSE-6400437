package com.cognizant.spring_learn.controller;

import java.util.ArrayList;
import com.cognizant.spring_learn.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class CountryController {

	private static final Logger LOGGER=LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	CountryService ctryService;
	
	@GetMapping("/countries")
	public ArrayList<Country> getAllCountry()
	{
		LOGGER.info("Start");
		
		ArrayList<Country> country=ctryService.getAllCountry();
		
		LOGGER.debug("{}",country);
		LOGGER.info("End");
		return country;
	}
}
