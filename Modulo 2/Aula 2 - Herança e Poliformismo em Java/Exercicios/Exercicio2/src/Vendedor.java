import java.util.List;

public non-sealed class Vendedor extends Users {
    private final boolean administrador = false;

    private int salesVolume;


    public int getSalesVolume() {
        return salesVolume;
    }


    public void realizarVendas(String sales, double value, int volume){
        super.setSales(sales);

        this.salesVolume += volume;
        double total = value * volume;
        super.setValueTotal(total);
        System.out.println("\nVenda realizada com sucesso. \nProduto: " + sales + "\nValor: R$" + value + "\nQuantidade/Volume: " + volume + "\nTotal da venda: R$" + total);

    }

    @Override
    public List<String> getSales() {
        return super.getSales();
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void realizarLogin(String email, String password){
        if(getEmail().equalsIgnoreCase(email) && getPassword().equalsIgnoreCase(password)) {
            super.setEmail(email);
            super.setPassword(password);
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("E-Mail ou senha incorretos");
        }
    }

    public void realizarLogout(){
        System.out.println("Logout realizado com sucesso");
    }

    /*Não fiz o alterar dados pois não entendi que dado deve ser alterado*/

    public void alterarSenha(String senhaAntiga, String novaSenha){
        String senha = senhaAntiga;
        if(getPassword().equalsIgnoreCase(senha)){
            super.setPassword(novaSenha);
            System.out.println("Senha alterada com sucesso");
            System.out.println("Nova Senha: " + getPassword());
        } else {
            System.out.println("Senha incorreta. Tente novamente");
            return;
        }

    }
}
