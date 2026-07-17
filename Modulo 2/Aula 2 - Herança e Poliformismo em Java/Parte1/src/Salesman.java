public final class Salesman extends Employee {
    /* final diz que ninguem pode extender dela*/
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    private double percentPerSold;
}
