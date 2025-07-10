package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CountryService {

	private static final Logger LOGGER=LoggerFactory.getLogger(CountryService.class);
	
	public ArrayList<Country> getAllCountry()
	{
		LOGGER.info("Inside Service class...");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countryList = context.getBean("countryList", ArrayList.class);
		
		LOGGER.info("Searching for the Country...");
		/**for (Country i:countryList)
		{
			if (i.getCode().equalsIgnoreCase(code))
				return i;
		}
		*/
		LOGGER.info("Invalid Code...");
		return countryList;
	}
}
