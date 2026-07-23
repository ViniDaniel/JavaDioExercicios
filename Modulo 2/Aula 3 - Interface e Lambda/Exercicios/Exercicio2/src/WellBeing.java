public record WellBeing(double value) implements TaxCalculation {
    private static final double taxWellBeing = 0.015;
    @Override
    public double getTax() {
        return taxWellBeing * value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
