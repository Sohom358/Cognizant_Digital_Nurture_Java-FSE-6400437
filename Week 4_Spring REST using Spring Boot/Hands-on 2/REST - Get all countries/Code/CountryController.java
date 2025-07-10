package com.cognizant.spring_learn.controller;

import java.util.ArrayList;
import com.cognizant.spring_learn.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@RestController
public class CountryController {

	private static final Logger LOGGER=LoggerFactory.getLogger(CountryController.class);
	
	@GetMapping("/countries")
	public ArrayList<Country> getAllCountries()
	{
		LOGGER.info("Start");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countryList = context.getBean("countryList", ArrayList.class);
        
		LOGGER.debug("{}",countryList);
		LOGGER.info("End");
		return countryList;
	}
}
