package Exercise_12;
/*
 * 5. Design a system where Printable and Savable interfaces are implemented by a class Document. Use default methods for shared behavior.

 */
//Printable interface
interface Printable {
 // Abstract method for printing
 void print();

 // Default method for shared behavior
 default void showPrintStatus() {
     System.out.println("Printing completed successfully.");
 }
}

//Savable interface
interface Savable {
 // Abstract method for saving
 void save();

 // Default method for shared behavior
 default void showSaveStatus() {
     System.out.println("Document saved successfully.");
 }
}

//Document class implementing both Printable and Savable interfaces
class Document implements Printable, Savable {
 private String content;

 // Constructor
 public Document(String content) {
     this.content = content;
 }

 // Implementation of print() method
 @Override
 public void print() {
     System.out.println("Printing Document: " + content);
     showPrintStatus(); // Using default method from Printable interface
 }

 // Implementation of save() method
 @Override
 public void save() {
     System.out.println("Saving Document: " + content);
     showSaveStatus(); // Using default method from Savable interface
 }
}

//Main class to test the system
public class Q5 {
 public static void main(String[] args) {
     // Create a Document object
     Document doc = new Document("This is a sample document.");

     // Print the document
     doc.print();

     // Save the document
     doc.save();
 }
}



