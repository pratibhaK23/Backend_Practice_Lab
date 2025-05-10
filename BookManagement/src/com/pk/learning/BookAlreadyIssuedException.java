package com.pk.learning;

public class BookAlreadyIssuedException extends Exception{

	public BookAlreadyIssuedException(String message)
	{
		super(message);
	}
}
