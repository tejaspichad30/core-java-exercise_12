package Exercise_12;
/*
 * 7. Explain the importance of abstract classes in inheritance. Provide a program to demonstrate multilevel inheritance with an abstract base class.

Importance of Abstract Classes in Inheritance
Abstract classes play a critical role in inheritance by:

1. Providing a Common Template: They define common properties and behaviors for all 
   derived classes.
2. Encapsulating Shared Logic: Concrete methods in an abstract class can encapsulate 
   shared logic, avoiding duplication in derived classes.
3. Forcing Implementation: Abstract methods ensure that derived classes must provide
   specific implementations, maintaining design consistency.
4. Supporting Partial Implementation: Abstract classes allow partial implementation 
   of functionality, leaving some methods abstract for derived classes to implement.
 */

//Abstract base class
abstract class Animal {
 // Abstract method (must be implemented by subclasses)
 abstract void sound();

 // Concrete method (shared logic)
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Intermediate derived class
class Mammal extends Animal {
 @Override
 void sound() {
     System.out.println("Mammals make a variety of sounds.");
 }

 void walk() {
     System.out.println("Mammals walk on legs.");
 }
}

//Final derived class
class Dog extends Mammal {
 @Override
 void sound() {
     System.out.println("Dogs bark.");
 }

 void specificBehavior() {
     System.out.println("Dogs wag their tails when happy.");
 }
}

//Main class to demonstrate multilevel inheritance
public class Q7 {
 public static void main(String[] args) {
     // Create an instance of Dog
     Dog myDog = new Dog();

     // Access methods at various levels of inheritance
     myDog.sound(); // Overridden in Dog
     myDog.walk();  // Inherited from Mammal
     myDog.eat();   // Inherited from Animal
     myDog.specificBehavior(); // Unique to Dog
 }
}
