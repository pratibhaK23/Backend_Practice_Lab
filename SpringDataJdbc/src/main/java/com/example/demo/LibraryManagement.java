package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.BookDao;
import com.example.demo.entity.Book;

@SpringBootApplication
public class LibraryManagement {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(LibraryManagement.class, args);
		
		BookDao bookdao=context.getBean(BookDao.class) ;
		Book book=new Book();
//		book.setTitle("Harry Potter");
//		book.setAbout("Fiction, Drama, Thriller");
//		book.setAuthor("J K Rowling");
//		book.setLanguage("English");
//		book.setIssued(false);
//		bookdao.saveBook(book);
		
		
		
		
		//bookdao.deleteBook(3);
		//bookdao.isBookIssued(2);
		
		

	}

	
	
}
