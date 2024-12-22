package Exercise_12;
/*
 * 2. Advanced Design: Create a system for Employee Management using:
- An abstract class Employee with a method calculateSalary().
- Subclasses FullTimeEmployee and PartTimeEmployee with specific implementations.
- An interface Promotable for handling promotions.
 */
//Interface for handling promotions
interface Promotable {
 void promote(String newRole); // Method to handle promotion
}

//Abstract class Employee
abstract class Employee {
 private String name;
 private String id;
 private String role;

 // Constructor
 public Employee(String name, String id, String role) {
     this.name = name;
     this.id = id;
     this.role = role;
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Getter for role
 public String getRole() {
     return role;
 }

 // Setter for role
 public void setRole(String role) {
     this.role = role;
 }

 // Abstract method for calculating salary
 public abstract double calculateSalary();

 // Display employee details
 public void displayDetails() {
     System.out.println("ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Role: " + role);
 }
}

//Subclass FullTimeEmployee
class FullTimeEmployee extends Employee implements Promotable {
 private double monthlySalary;

 // Constructor
 public FullTimeEmployee(String name, String id, String role, double monthlySalary) {
     super(name, id, role);
     this.monthlySalary = monthlySalary;
 }

 // Implementation of calculateSalary()
 @Override
 public double calculateSalary() {
     return monthlySalary;
 }

 // Implementation of promote()
 @Override
 public void promote(String newRole) {
     setRole(newRole);
     System.out.println("Full-time employee promoted to: " + newRole);
 }
}

//Subclass PartTimeEmployee
class PartTimeEmployee extends Employee implements Promotable {
 private double hourlyRate;
 private int hoursWorked;

 // Constructor
 public PartTimeEmployee(String name, String id, String role, double hourlyRate, int hoursWorked) {
     super(name, id, role);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 // Implementation of calculateSalary()
 @Override
 public double calculateSalary() {
     return hourlyRate * hoursWorked;
 }

 // Implementation of promote()
 @Override
 public void promote(String newRole) {
     setRole(newRole);
     System.out.println("Part-time employee promoted to: " + newRole);
 }
}

//Main class to test the system
public class Q2 {
 public static void main(String[] args) {
     // Create a full-time employee
     FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Tejas", "FT123", "Software Engineer", 60000);
     fullTimeEmp.displayDetails();
     System.out.println("Monthly Salary: $" + fullTimeEmp.calculateSalary());
     fullTimeEmp.promote("Senior Software Engineer");
     fullTimeEmp.displayDetails();

     System.out.println();

     // Create a part-time employee
     PartTimeEmployee partTimeEmp = new PartTimeEmployee("King", "PT456", "Data Analyst", 25, 1000);
     partTimeEmp.displayDetails();
     System.out.println("Monthly Salary: $" + partTimeEmp.calculateSalary());
     partTimeEmp.promote("Lead Data Analyst");
     partTimeEmp.displayDetails();
 }
}


