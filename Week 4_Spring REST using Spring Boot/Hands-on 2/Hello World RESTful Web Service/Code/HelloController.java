package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

	private static final Logger LOGGER=LoggerFactory.getLogger("HelloController.class");
	
	@GetMapping("/hello")
	public String sayHello()
	{
		LOGGER.info("Start");
		String response="Hello World!!";
		LOGGER.info("End");
		return response;
	}
}
