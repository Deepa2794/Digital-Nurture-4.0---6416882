package strategypattern;

public class StrategyPatternTest {
 public static void main(String[] args) {
     PaymentContext context = new PaymentContext();

     PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
     context.setPaymentStrategy(creditCard);
     context.payAmount(250.00);

     System.out.println("---");

     PaymentStrategy paypal = new PayPalPayment("john@example.com");
     context.setPaymentStrategy(paypal);
     context.payAmount(99.99);
 }
}
