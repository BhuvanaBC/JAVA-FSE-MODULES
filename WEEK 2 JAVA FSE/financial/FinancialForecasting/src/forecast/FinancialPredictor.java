package forecast;

public class FinancialPredictor {

    
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } else {
            return calculateFutureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }
}
