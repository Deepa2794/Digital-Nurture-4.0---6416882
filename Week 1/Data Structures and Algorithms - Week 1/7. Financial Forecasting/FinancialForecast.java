package financialforecasting;

public class FinancialForecast {

 /**
  * Recursively calculates the future value of an investment.
  * @param presentValue initial investment
  * @param growthRate annual growth rate (e.g., 0.05 for 5%)
  * @param years number of years
  * @return future value
  */
 public static double calculateFutureValue(double presentValue, double growthRate, int years) {
     if (years == 0) {
         return presentValue;
     }
     return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, years - 1);
 }
}
