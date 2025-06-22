package decoratorpattern;

public class NotificationTest {
 public static void main(String[] args) {
     
     Notifier emailNotifier = new EmailNotifier();

     Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

     Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

     fullNotifier.send("System update at 9 PM tonight.");
 }
}
