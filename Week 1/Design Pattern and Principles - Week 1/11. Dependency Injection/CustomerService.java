package dependencyinjection;

public class CustomerService {
 private final CustomerRepository customerRepository;

 public CustomerService(CustomerRepository customerRepository) {
     this.customerRepository = customerRepository;
 }

 public void displayCustomer(String customerId) {
     String customerInfo = customerRepository.findCustomerById(customerId);
     System.out.println(customerInfo);
 }
}
