package Exercise_12;
/*
 * 4. Create two interfaces, Flyable and Swimmable, with appropriate methods. Implement both in a class Duck to demonstrate multiple inheritance
 */
//Flyable interface
interface Flyable {
 void fly(); // Method for flying
}

//Swimmable interface
interface Swimmable {
 void swim(); // Method for swimming
}

//Duck class implementing both interfaces
class Duck implements Flyable, Swimmable {
 private String name;

 // Constructor
 public Duck(String name) {
     this.name = name;
 }

 // Implementation of fly() method from Flyable interface
 @Override
 public void fly() {
     System.out.println(name + " is flying gracefully in the sky.");
 }

 // Implementation of swim() method from Swimmable interface
 @Override
 public void swim() {
     System.out.println(name + " is swimming effortlessly in the water.");
 }

 // Additional behavior for Duck
 public void quack() {
     System.out.println(name + " says: Quack Quack!");
 }
}

//Main class to test multiple inheritance
public class Q4 {
 public static void main(String[] args) {
     // Create a Duck object
     Duck myDuck = new Duck("Daffy");

     // Display Duck's abilities
     myDuck.quack();
     myDuck.fly();
     myDuck.swim();
 }
}


