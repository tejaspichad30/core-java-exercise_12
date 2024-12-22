package Exercise_12;

/*
 10. What is the main purpose of abstraction in software design? 
 Implement Real-world Scenario: Explain how abstraction can be applied to 
 design an online payment system.
 
 ANS :
 
Main Purpose of Abstraction in Software Design
Abstraction in software design serves the following main purposes:

1. Hiding Complexity: Abstraction allows developers to hide the complex implementation 
   details of a system, providing a simple interface to interact with.

2. Focus on Essential Features: It helps to focus on essential aspects while ignoring 
   unnecessary details, making the system easier to use and maintain.

3. Flexibility and Scalability: Abstraction enables the design of systems that are 
   flexible and scalable, allowing the introduction of new components without 
   disrupting existing functionality.

4. Encapsulation: Abstraction promotes the encapsulation of behavior, ensuring that 
   the internal workings of a class or system are not exposed to external code 
   unnecessarily.
 */

// Implementation 

//Abstract class representing the general concept of a Payment Method
abstract class PaymentMethod {
 // Abstract method for processing the payment
 abstract void processPayment(double amount);
 
 // Concrete method for refunding the payment (same for all methods)
 void refund(double amount) {
     System.out.println("Refunding " + amount + " to the user.");
 }
}

//Concrete class for CreditCard Payment
class CreditCardPayment extends PaymentMethod {
 private String cardNumber;

 // Constructor to initialize the Credit Card details
 public CreditCardPayment(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 @Override
 void processPayment(double amount) {
     System.out.println("Processing credit card payment of " + amount);
 }
}

//Concrete class for PayPal Payment
class PayPalPayment extends PaymentMethod {
 private String paypalAccount;

 // Constructor to initialize PayPal account details
 public PayPalPayment(String paypalAccount) {
     this.paypalAccount = paypalAccount;
 }

 @Override
 void processPayment(double amount) {
     System.out.println("Processing PayPal payment of " + amount);
 }
}

//Concrete class for Crypto Payment
class CryptoPayment extends PaymentMethod {
 private String cryptoWallet;

 // Constructor to initialize the Crypto Wallet details
 public CryptoPayment(String cryptoWallet) {
     this.cryptoWallet = cryptoWallet;
 }

 @Override
 void processPayment(double amount) {
     System.out.println("Processing Crypto payment of " + amount);
 }
}

//Main class to demonstrate the system
public class Q10 {
 public static void main(String[] args) {
     // Creating different payment methods
     PaymentMethod creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
     PaymentMethod paypalPayment = new PayPalPayment("user@paypal.com");
     PaymentMethod cryptoPayment = new CryptoPayment("crypto-wallet-xyz");

     // Processing payments
     creditCardPayment.processPayment(100.0);
     paypalPayment.processPayment(200.0);
     cryptoPayment.processPayment(300.0);

     // Refunds
     creditCardPayment.refund(50.0);
     paypalPayment.refund(75.0);
     cryptoPayment.refund(25.0);
 }
}

