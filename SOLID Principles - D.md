Dependency Inversion Principle:

- Principle in object-oriented design that states that "High-level modules should not depend on low-level modules. Both should depend on abstractions".
- Abstractions should not depend on details but details should depend on abstractions.
- In simple terms, the DIP suggests that classes should rely on abstractions e.g., interfaces or abstract classes rather than concrete implementations.
- This allows for more flexible and decoupled code, making it easier to change implementations without affecting other parts of the codebase.

Payments.java


package dependencyInversionPrinciple;
public interface Payments {
  
  void processPayment(double amount);

}



CreditCardPayement.java


package dependencyInversionPrinciple;
public class CreditCardPayment implements Payments {

  @Override
    public void processPayment(double amount) {
		System.out.println("Processing payment via Credit card:" +amount);
		
}
}


PayPalPaymemt.java


package dependencyInversionPrinciple;
public class PayPalPayment implements Payments {

  public void processPayment(double amount) {
    System.out.println("Processing payment via Paypal:" +amount);

}

}


