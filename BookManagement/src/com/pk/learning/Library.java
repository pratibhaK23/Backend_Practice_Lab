package com.pk.learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Library {

	Map<Integer,Book> books = new HashMap<>();
	
	public void addBook(Book book)
	{
		books.put(book.getBookId(), book);
	}
	
	public void removeBook(int id) throws BookNotFoundException
	{
		if(!books.containsKey(id))
		{
			throw new BookNotFoundException("Book id"+" "+id+" "+"not found");
		}
		books.remove(id);
	}
	
	public void issueBook(int id) throws BookAlreadyIssuedException, BookNotFoundException
	{
		if(!books.containsKey(id))
		{
			new BookNotFoundException("Book id"+" "+id+" "+"not found");
		}
		
		Book book=books.get(id);
		
		if(book.isIssued()==true)
		{
			new BookAlreadyIssuedException("Book "+" "+id+" "+"is already issued to other customer");
		}
		
		book.setIssued(true);
	}
	
	public void returnBook(int id) throws BookNotFoundException
	{
		if(!books.containsKey(id))
		{
			new BookNotFoundException("Book id"+" "+id+" "+"not found");
		}
		
		Book book=books.get(id);
		book.setIssued(false);
	}
	
	public void listAvailableBooks()
	{
		//books.forEach((Integer,Book)->System.out.println(Book));
//		
//		Iterator<Map.Entry<Integer, Book>> itr=books.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			Map.Entry<Integer, Book> map =itr.next();
//			System.out.println(map.getValue());
//		}
		
		for(Book book:books.values())
		{
			if(!book.isIssued())
			{
				System.out.println(book);

			}
		}
	}
	
	public void listIssuedBooks()
	{
		for(Book book:books.values())
		{
			if(book.isIssued())
				System.out.println(book);
		}
	}
}
