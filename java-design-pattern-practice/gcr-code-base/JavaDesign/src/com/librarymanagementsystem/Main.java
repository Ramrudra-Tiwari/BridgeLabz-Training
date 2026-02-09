package com.librarymanagementsystem;

public class Main {

	public static void main(String[] args) {
		LibraryCatalog catalog = LibraryCatalog.getInstance();
		
		try {
			//here user created
			IUser student = UsersFactory.createUser("student", "ravi");
			IUser faculty = UsersFactory.createUser("faculty", "kali");
			
			//here we add user
			catalog.addUser(student);
			catalog.addUser(faculty);
			
			student.showRoles();
			faculty.showRoles();
			
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		//here we create new book
		Book book1 = new Book.Builder()
							.title("Atomic Habits")
							.author("James Clear")
							.genre("Self Improvements")
							.edition(2019)
							.build();
		
		
		//now we can add book
		catalog.addBooks(book1);
	}
}