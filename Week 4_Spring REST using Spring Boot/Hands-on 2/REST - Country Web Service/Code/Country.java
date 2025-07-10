package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

	private static final Logger LOGGER=LoggerFactory.getLogger(Country.class);
	
	private String code;
	private String name;
	
	Country()
	{
		LOGGER.info("Inside Country Constructor");
	}
	
	public String getCode()
	{
		LOGGER.debug("Getting country code...");
		return code;
	}
	public String getName()
	{
		LOGGER.debug("Getting country name...");
		return name;
	}
	public void setCode(String code)
	{
		LOGGER.debug("Setting country code...");
		this.code=code;
	}
	public void setName(String name)
	{
		LOGGER.debug("Setting country name...");
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Country [code=" + code + " ,name=" + name + " ]";
	}
}
