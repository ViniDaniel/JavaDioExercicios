public record Clothing(double value) implements TaxCalculation {
    private static final double taxClothing = 0.025;
    @Override
    public double getTax() {
        return taxClothing * value;
    }

    @Override
    public double getValue() {
        return value;
    }
}
