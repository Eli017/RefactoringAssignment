public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    int getConstant() {
        return 0;
    }

    @Override
    double getWeight() {
        return 0.365;
    }

    @Override
    public int getAdjustment() {
        return 0;
    }
}
