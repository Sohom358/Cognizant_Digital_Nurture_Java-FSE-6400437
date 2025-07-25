package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
	
	@GetMapping("/authenticate")
	public Map<String,String> authenticate(@RequestHeader("Authorization") String authHeader)
	{
		 LOGGER.info("START authentication");
	     LOGGER.debug("Authorization Header: {}", authHeader);
	     
	     Map<String, String> map = new HashMap<>();
	     map.put("token", "");
	     
	     getUser(authHeader);
	     
	     LOGGER.info("END authentication");
	     return map;
	}
	
	private String getUser(String authHeader)
	{
		LOGGER.debug("Start decoding Authorization header...");
		
		String encodedCredentials=authHeader.substring("Basic ".length());
		
		byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
	    String decodedString = new String(decodedBytes);
	    
	    String username = decodedString.split(":")[0];
	    
        LOGGER.debug("Decoded String: {}", decodedString);
        LOGGER.debug("Extracted Username: {}", username);
        
        return username;
	}
}
