package com.pk.learning;

public class Manage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library=new Library();
         System.out.println("Add Book");
		library.addBook(new Book(101,"Panchatatra","Ashish Kumar",false));
		library.addBook(new Book(1131,"Secrets of Heaven","Sherlock Holmes",true));
		library.addBook(new Book(1701,"Harry Potter","Julian Dac",false));
		library.addBook(new Book(1501,"ABC Well","Orwell",true));
		library.addBook(new Book(1011,"Pachayat","kiansh Kumar",true));

		library.addBook(new Book(1014, "The Alchemist", "Paulo Coelho",false));
        library.addBook(new Book(1022, "1984", "George Orwell",false));
        library.addBook(new Book(1031, "Clean Code", "Robert C. Martin",true));
		
        System.out.println("Issue Book");
        try {
            library.issueBook(1014);

        }catch(Exception e) {
        	e.getMessage();
        }
        
        System.out.println("Return Book");
        try {
        	library.returnBook(1031);
        }catch(Exception e) {
        	e.getMessage();
        }
        
        System.out.println("Remove Book");
        try {
            library.removeBook(1501);

        }catch(Exception e) {
        	e.getMessage();
        }
        
        System.out.println("List available Books");
        library.listAvailableBooks();
        
        System.out.println("List issued Books");
        library.listIssuedBooks();
		
		
		
	}

}
