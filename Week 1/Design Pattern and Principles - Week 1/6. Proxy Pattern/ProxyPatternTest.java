package proxypattern;

public class ProxyPatternTest {
 public static void main(String[] args) {
     Image image1 = new ProxyImage("nature.jpg");

     image1.display();

     System.out.println("---");

     image1.display();

     System.out.println("---");

     Image image2 = new ProxyImage("ocean.jpg");
     image2.display();
 }
}
