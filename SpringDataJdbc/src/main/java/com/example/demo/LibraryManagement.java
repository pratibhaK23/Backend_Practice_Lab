package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.BookDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Book;
import com.example.demo.entity.User;

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
		
		
//		bookdao.getBook(4);
//		bookdao.getAllBooks();
		//bookdao.deleteBook(3);
		//bookdao.isBookIssued(2);
		
		
		UserDao userdao=context.getBean(UserDao.class);
		User user=new User();
//		
//		user.setUsername("abc2323");
//		user.setPassword("1234");
//		user.setEmail("abc@gmail.com");
		
//		userdao.saveUser(user);
//         userdao.getAllUsers();
//         userdao.getUser(1);
	}

	
	
}
