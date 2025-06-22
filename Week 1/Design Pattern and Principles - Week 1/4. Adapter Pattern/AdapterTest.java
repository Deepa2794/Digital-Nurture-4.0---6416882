package adapterpattern;

public class AdapterTest {
 public static void main(String[] args) {
     PaypalGateway paypalGateway = new PaypalGateway();
     PaymentProcessor paypalProcessor = new PaypalAdapter(paypalGateway);
     paypalProcessor.processPayment(100.00);
     StripeGateway stripeGateway = new StripeGateway();
     PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
     stripeProcessor.processPayment(250.50);
 }
}
