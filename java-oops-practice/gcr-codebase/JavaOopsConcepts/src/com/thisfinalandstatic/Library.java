package com.thisfinalandstatic;

public class Library extends LibraryManagement{
	   public static void main(String[] args) {
	       // Set the library name (static variable)
		   LibraryManagement.setLibraryName("Egmore Library");
	       // Display the library name
		   LibraryManagement.displayLibraryName();
	       // Create a new book instance
		   LibraryManagement book1 = new LibraryManagement("Effective Java", "Joshua Bloch", "978-0134685991");
	       // Display book details
	       book1.displayBookDetails();
	   }
	}
