package Exercise_12;
// 9. Scenario-Based Question: Design an abstract class Appliance with methods 
//    turnOn() (abstract) and turnOff() (concrete). Create subclasses for 
//    WashingMachine and Microwave.

//Abstract class Appliance
abstract class Appliance {
 // Abstract method to turn on the appliance (to be implemented by subclasses)
 abstract void turnOn();

 // Concrete method to turn off the appliance
 void turnOff() {
     System.out.println("The appliance is now OFF.");
 }
}

//Subclass WashingMachine
class WashingMachine extends Appliance {
 @Override
 void turnOn() {
     System.out.println("Washing machine is now ON. Starting the wash cycle.");
 }
}

//Subclass Microwave
class Microwave extends Appliance {
 @Override
 void turnOn() {
     System.out.println("Microwave is now ON. Starting heating process.");
 }
}

//Main class to test the functionality
public class Q9 {
 public static void main(String[] args) {
     // Create objects of WashingMachine and Microwave
     Appliance wm = new WashingMachine();
     Appliance mw = new Microwave();

     // Turn on and off the appliances
     wm.turnOn();  // WashingMachine specific behavior
     wm.turnOff(); // Common behavior from Appliance class

     mw.turnOn();  // Microwave specific behavior
     mw.turnOff(); // Common behavior from Appliance class
 }
}


