package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@RestController
public class CountryController {

	private static final Logger LOGGER=LoggerFactory.getLogger(CountryController.class);
	
	@RequestMapping("/country")
	public Country getCountryIndia()
	{
		LOGGER.info("Start");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        
		LOGGER.debug("{}",country);
		LOGGER.info("End");
		return country;
	}
}
