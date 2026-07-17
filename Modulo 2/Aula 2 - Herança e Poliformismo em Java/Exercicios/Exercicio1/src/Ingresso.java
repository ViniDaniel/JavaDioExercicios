public abstract sealed class Ingresso permits IngressoFamilia, IngressoMeiaEntrada {
    private String filmName;
    private double price;
    private String closedCaptions;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.out.println("O preço não pode ser 0 e nem negativo");
            return;
        }
        this.price = price;
    }

    public String getClosedCaptions() {
        return closedCaptions;
    }

    public void setClosedCaptions(String closedCaptions) {
        this.closedCaptions = closedCaptions;
    }
}
