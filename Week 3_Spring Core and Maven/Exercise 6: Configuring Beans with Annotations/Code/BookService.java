package com.library.service;
import com.library.repository.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class BookService {
    
	@Autowired
	private BookRepository bookRepository;
	public void setBookRepository(BookRepository bookRepository){
		this.bookRepository=bookRepository;
	}
	public void run()
	{
		System.out.println(bookRepository.message());
	}
}
