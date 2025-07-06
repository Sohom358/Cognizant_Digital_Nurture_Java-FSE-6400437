package com.library;
import com.library.service.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		BookService ser=context.getBean("bookService",BookService.class);
		ser.run();
	}
}
