SOLID Principles:
In Java, SOLID principles represent an object-oriented approach applied to software structure design.
By adhering to SOLID principles, developers can ensure that their software is modular, easy to understand, debug, and refactor.

The word SOLID acronym for:

Single Responsibility Principle (SRP)
Open-Closed Principle (OCP)
Liskov Substitution Principle (LSP)
Interface Segregation Principle (ISP)
Dependency Inversion Principle (DIP)


1. Single Responsibility Principle (SRP):
- This principle states that “A class should have only one reason to change” which means every class should have a single responsibility or single job or single purpose.
- In other words, a class should have only one job or purpose within the software system.
- Here I have considered an example of Library Management system that includes 6 classes:
  Book.java --> defines the attributes of the Book
  addBook.java --> Logic to add new book to the library
  removeBook.java --> Manages the process of removing a book from library
  listBook.java --> Lists all the books available

All these 4 classes focuses on a single task. Now, instead of using all 4 classes separately I created another class (LibraryManagement.java) which combines all the tasks of all the 4 classes.
In the main class LibraryImpl.java, I created only one instance of LibraryManagement.java so that we don't have to deal with 4 separate classes directly. This makes code more simpler and cleaner.


Book.java
package singleResponsibilityPrinciple;
public class Book {

	private String title;
	private String author;
	private String isbn;
	public Book(String title, String author, String isbn) {	
		this.title = title;
        	this.author = author;
        	this.isbn = isbn;

	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
}


AddBook.java
package singleResponsibilityPrinciple;
public class AddBook {
	private LibraryManagement library;
	public AddBook(LibraryManagement library) {
		this.library = library;
	}
	public void execute(Book book) {
		library.addBook(book);
	}
}

RemoveBook.java
package singleResponsibilityPrinciple;
public class RemoveBook {
	private LibraryManagement library;
	public RemoveBook(LibraryManagement library) {
		this.library = library;
	}
	public void execute(Book book) {
		library.removeBook(book);
	}
}


ListBooks.java
package singleResponsibilityPrinciple;
public class ListBooks {
	private LibraryManagement library;
	public ListBooks(LibraryManagement library) {
		this.library = library;
	}
	public void execute() {
		library.listBooks();
	}
}


LibraryManagement.java
package singleResponsibilityPrinciple;
import java.util.ArrayList;
import java.util.List;
public class LibraryManagement {
	    private List<Book> books;
	    public LibraryManagement() {
	        this.books = new ArrayList<>();
	    }
  	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println("Added: " + book);
	    }
	    public void removeBook(Book book) {
	        if (books.contains(book)) {
	            books.remove(book);
	            System.out.println("Removed: " + book);
	        } else {
	            System.out.println("Book not found: " + book);
	        }
	    }
	    public void listBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books available in the library.");
	        } else {
	            System.out.println("Books in the Library:");
	            for (Book book : books) {
	                System.out.println(book);
	            }
	        }
	    }
	}

LibraryImpl.java
package singleResponsibilityPrinciple;
public class LibraryImpl {
	public static void main(String[] args) {
		LibraryManagement library = new LibraryManagement();
     	        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890");
	        Book book2 = new Book("1984", "George Orwell", "0987654321");
	        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "1122334455");
       	        AddBook addBookAction = new AddBook(library);
	        //RemoveBook removeBookAction = new RemoveBook(library);
	        //ListBooks listBooksAction = new ListBooks(library);    
	        addBookAction.execute(book1);
	        addBookAction.execute(book2);
	        addBookAction.execute(book3);
    	        //listBooksAction.execute();
        	//removeBookAction.execute(book2);        
	        //listBooksAction.execute();
	    }
		
	}












