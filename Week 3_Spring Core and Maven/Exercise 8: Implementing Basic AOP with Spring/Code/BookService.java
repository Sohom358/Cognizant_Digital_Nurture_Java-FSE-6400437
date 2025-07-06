package com.library.service;
import com.library.repository.*;

public class BookService {
    
	private BookRepository bookRepository;
	public BookService(BookRepository bookRepository)
	{
		this.bookRepository=bookRepository;
		test();
	}
	
	public void setBookRepository(BookRepository bookRepository){
		this.bookRepository=bookRepository;
	}
	
	public void run()
	{
		System.out.println(bookRepository.message());
	}
	
	public void test() {
		System.out.println("Constructor is injected...");
	}
}
