package com.library.service;
import com.library.repository.*;
public class BookService {
    
	private BookRepository bookRepository;
	public void setBookRepository(BookRepository bookRepository){
		this.bookRepository=bookRepository;
	}
	public void run()
	{
		System.out.println(bookRepository.message());
	}
}
