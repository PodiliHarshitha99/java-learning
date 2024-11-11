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

