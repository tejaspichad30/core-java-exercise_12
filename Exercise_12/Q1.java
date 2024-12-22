package Exercise_12;
/*
 * 1. Design a Library Management System with a class Book and interfaces Issueable and Returnable. Include methods for issuing and returning books.

 */
//Interface for issuing books
interface Issueable {
 void issueBook(String memberId); // Method to issue a book
}

//Interface for returning books
interface Returnable {
 void returnBook(); // Method to return a book
}

//Class representing a Book
class Book implements Issueable, Returnable {
 private String title;
 private String author;
 private String isbn;
 private boolean isIssued;
 private String issuedTo;

 // Constructor
 public Book(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
     this.isIssued = false;
     this.issuedTo = null;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
     System.out.println("Issued: " + (isIssued ? "Yes (To: " + issuedTo + ")" : "No"));
 }

 // Implementation of Issueable interface
 @Override
 public void issueBook(String memberId) {
     if (isIssued) {
         System.out.println("Book is already issued to: " + issuedTo);
     } else {
         isIssued = true;
         issuedTo = memberId;
         System.out.println("Book issued to: " + memberId);
     }
 }

 // Implementation of Returnable interface
 @Override
 public void returnBook() {
     if (!isIssued) {
         System.out.println("Book is not issued.");
     } else {
         System.out.println("Book returned by: " + issuedTo);
         isIssued = false;
         issuedTo = null;
     }
 }
}

//Main class to test the system
public class Q1{
 public static void main(String[] args) {
     // Create a new book
     Book book1 = new Book("Do the Epic Shit", "Ankur Warikoo", "123456789");

     // Display book details
     book1.displayDetails();

     // Issue the book
     book1.issueBook("Member001");

     // Display book details after issuing
     book1.displayDetails();

     // Try issuing the book again
     book1.issueBook("Member002");

     // Return the book
     book1.returnBook();

     // Display book details after returning
     book1.displayDetails();

     // Try returning the book again
     book1.returnBook();
 }
}


