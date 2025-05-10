package com.example.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public class BookDao {

	private JdbcTemplate jdbcTemplate;
	
	public BookDao(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	public void saveBook(Book book)
	{
		String query="insert into book (title,author,about,language,isIssued) values(?,?,?,?,?)";
		
		int rowsAffected=jdbcTemplate.update(query, book.getTitle(),book.getAuthor(),book.getAbout(),
				book.getLanguage(),book.isIssued());
		
		System.out.println("Book added"+rowsAffected);
	}
	
	public void deleteBook(long id)
	{
		String query="delete from book where id=?";
		int rowsAffected=jdbcTemplate.update(query,id);
		
		System.out.println("Book deleted"+rowsAffected);

	}
	
	public void updateBook(long id, Book newbook)
	{
		String query="update book set title= ?, author= ?, about= ?, language= ?,isIssued= ? where id= ?";
		int rowsAffected=jdbcTemplate.update(query,newbook.getTitle(),newbook.getAuthor(),newbook.getAbout()
				,newbook.getLanguage(), newbook.isIssued(), id);
		
		System.out.println("Book Updated"+rowsAffected);

	}
	
	public void getBook(long id)
	{
		String query="select *from book where id=?";
       Book book= jdbcTemplate.queryForObject(query, new BookRowMapper(),id);
        System.out.println("Book fetched"+"  "+book.getTitle());
				
	}
	
	public List<Book> getAllBooks()
	{
		String query="select * from book ";
		List<Book> books=jdbcTemplate.query(query, new BookRowMapper());
		return books;
	}
	
	public List<Book> searchBook(String titleKeyword)
	{
		String query="Select *from book where title like ?";
		List<Book> books=jdbcTemplate.query(query,new BookRowMapper(),"%"+titleKeyword+"%");
		return books;
	}
	
	public void isBookIssued(long id)
	{
		String query="select *from book where id=?";
		Book book=jdbcTemplate.queryForObject(query, new BookRowMapper(),id);
		if(book.isIssued()==true)
		{
			System.out.println("Book Id"+" "+id+" "+"is not available for issue");
		}
		else
		{
			String query1="update book set isIssued=true where id=?";
			jdbcTemplate.update(query1,id);
			System.out.println("Book Id"+" "+id+" "+"has been issued to you");
		}
	}
}
