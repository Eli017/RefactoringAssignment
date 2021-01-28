public class InsuranceCalculator {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return (income-10000)*0.2+35600;
        } else if (income <= insuranceStrategyVeryHigh.getAdjustment()) {
            return (income-30000)*0.1+76500;
        } else {
            return insuranceStrategyVeryHigh.calculateInsuranceVeryHigh(income);
        }
    }

    public double calculateInsuranceVeryHigh(double income) {
        return insuranceStrategyVeryHigh.calculateInsuranceVeryHigh(income);
    }

    private int getConstant() {
        return insuranceStrategyVeryHigh.getConstant();
    }

    private double getWeight() {
        return insuranceStrategyVeryHigh.getWeight();
    }

    public int getAdjustment() {
        return insuranceStrategyVeryHigh.getAdjustment();
    }
}
