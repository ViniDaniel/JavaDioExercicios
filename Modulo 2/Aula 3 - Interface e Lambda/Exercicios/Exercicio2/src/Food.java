public record Food(double value) implements TaxCalculation{
    private static final double taxFood = 0.01;
    @Override
    public double getTax() {
        return value * taxFood;
    }

    @Override
    public double getValue() {
        return value;
    }
}
