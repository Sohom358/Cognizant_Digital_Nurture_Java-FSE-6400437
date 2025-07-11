package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
	
	@GetMapping("/authenticate")
	public Map<String,String> authenticate(@RequestHeader("Authorization") String authHeader)
	{
		 LOGGER.info("START authentication");
	     LOGGER.debug("Authorization Header: {}", authHeader);
	     
	     String user=getUser(authHeader);
	     
	     String token=generateJwt(user);
	     
	     Map<String, String> map = new HashMap<>();
	     map.put("token", token);
	     
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
	
	private String generateJwt(String user)
	{
		LOGGER.info("Genrating token now");
		
		JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);

        // Set the token issue time as current time
        builder.setIssuedAt(new Date());

        // Set the token expiry as 20 minutes from now
        builder.setExpiration(new Date((new Date()).getTime() + 1200000));
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");

        String token = builder.compact();
        
        LOGGER.info("Token generated successfully");

        return token;

	}
}
