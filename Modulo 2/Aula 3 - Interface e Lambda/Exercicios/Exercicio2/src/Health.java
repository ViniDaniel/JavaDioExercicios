public record Health(double value) implements TaxCalculation{
    private static final double taxHealth = 0.015;
    @Override
    public double getTax() {
        return value * taxHealth;
    }

    @Override
    public double getValue() {
        return value;
    }
}
