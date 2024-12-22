package Exercise_12;
/*
 * 6. Java 8 Features in Interfaces: Explain how default and static methods in 
 * interfaces enhance functionality. Provide a code example.

Default and Static Methods in Interfaces in Java 8
Java 8 introduced default and static methods in interfaces to enhance their 
functionality while maintaining backward compatibility.

1. Default Methods
Purpose: Allow interfaces to include methods with a default implementation. 
This enables extending an interface without breaking existing implementations.
Key Features:
Can be overridden by implementing classes.
Provide a way to add common behavior to multiple classes.

2. Static Methods
Purpose: Allow interfaces to have utility methods that are associated with the 
interface itself, not instances of the implementing classes.
Key Features:
Cannot be overridden by implementing classes.
Called directly using the interface name.

implementation 
 */
//Interface with default and static methods
interface Calculator {

 // Abstract method
 int add(int a, int b);

 // Default method
 default int subtract(int a, int b) {
     return a - b;
 }

 // Static method
 static int multiply(int a, int b) {
     return a * b;
 }
}

//Class implementing the interface
class BasicCalculator implements Calculator {

 // Implementation of the abstract method
 @Override
 public int add(int a, int b) {
     return a + b;
 }

 // Optionally overriding the default method
 @Override
 public int subtract(int a, int b) {
     System.out.println("Custom subtraction logic in BasicCalculator");
     return a - b;
 }
}

//Main class to test functionality
public class Q6 {
 public static void main(String[] args) {
     BasicCalculator calc = new BasicCalculator();

     // Using the implemented abstract method
     System.out.println("Addition: " + calc.add(10, 5));

     // Using the overridden default method
     System.out.println("Subtraction: " + calc.subtract(10, 5));

     // Using the static method from the interface
     System.out.println("Multiplication: " + Calculator.multiply(10, 5));
 }
}


