package forecast;

public class Main {
    public static void main(String[] args) {
        double currentValue = 10000; 
        double growthRate = 0.10;    
        int years = 5;               

        double futureValue = FinancialPredictor.calculateFutureValue(currentValue, growthRate, years);

        System.out.println("Predicted future value after " + years + " years: ₹" + futureValue);
    }
}
