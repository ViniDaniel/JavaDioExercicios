import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public abstract sealed class Users permits Gerente, Atendente, Vendedor {
    private String name;
    private String email;
    private String password;
    private double valueTotal;
    private List<String> sales = new ArrayList<>(); // lista, não String

    public List<String> getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales.add(sales);
    }

    public double getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(double valueTotal) {
        this.valueTotal += valueTotal;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
