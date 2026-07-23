public record Culture(double value) implements TaxCalculation {
    private static final double taxCulture = 0.4;
    @Override
    public double getTax() {
        return taxCulture * value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
