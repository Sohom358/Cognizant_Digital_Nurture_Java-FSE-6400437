package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
	public String message() {
	    return "Beans is now configured successfully using annotations";
	}
}
