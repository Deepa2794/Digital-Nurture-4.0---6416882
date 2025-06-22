package observerpattern;

public class ObserverPatternTest {
 public static void main(String[] args) {
     
     StockMarket stockMarket = new StockMarket();

     Observer mobileApp = new MobileApp("MyMobile");
     Observer webApp = new WebApp("MyWeb");

     stockMarket.registerObserver(mobileApp);
     stockMarket.registerObserver(webApp);

     stockMarket.setStockPrice(150.00);

     stockMarket.removeObserver(mobileApp);

     stockMarket.setStockPrice(155.50);
 }
}
