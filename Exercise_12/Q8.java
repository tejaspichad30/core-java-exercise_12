package Exercise_12;
/*
 8. Can an abstract class have constructors and concrete methods? Justify with an 
    example.
 
1. Constructors:

- Abstract classes can have constructors to initialize fields that are common to all
   derived classes.
- While an abstract class cannot be instantiated directly, its constructor is called
   when a subclass object is created.
   
   
2. Concrete Methods:

- Abstract classes are allowed to have concrete (non-abstract) methods.
  These methods provide shared functionality to be reused by subclasses.
 */

//Abstract class
abstract class Shape {
 private String color;

 // Constructor to initialize the color
 public Shape(String color) {
     this.color = color;
     System.out.println("Shape constructor called");
 }

 // Concrete method to get the color
 public String getColor() {
     return color;
 }
 

 // Abstract method to calculate area
 abstract double calculateArea();
}

//Subclass for Circle
class Circle extends Shape {
 private double radius;

 // Constructor for Circle
 public Circle(String color, double radius) {
     super(color); // Call to abstract class constructor
     this.radius = radius;
 }

 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Subclass for Rectangle
class Rectangle extends Shape {
 private double length, width;

 // Constructor for Rectangle
 public Rectangle(String color, double length, double width) {
     super(color); // Call to abstract class constructor
     this.length = length;
     this.width = width;
 }

 @Override
 double calculateArea() {
     return length * width;
 }
}

//Main class to test the program
public class Q8 {
 public static void main(String[] args) {
     Shape circle = new Circle("Red", 5.0);
     System.out.println("Circle Color: " + circle.getColor());
     System.out.println("Circle Area: " + circle.calculateArea());

     Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
     System.out.println("Rectangle Color: " + rectangle.getColor());
     System.out.println("Rectangle Area: " + rectangle.calculateArea());
 }
}

