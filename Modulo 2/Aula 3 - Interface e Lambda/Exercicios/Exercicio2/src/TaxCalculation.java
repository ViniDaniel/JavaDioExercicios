public interface TaxCalculation {
    double getTax();
    double getValue();

    default double getFinalValue(){
        return getValue() + getTax();
    }
}
