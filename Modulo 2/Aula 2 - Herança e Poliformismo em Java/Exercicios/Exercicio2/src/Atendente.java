public non-sealed class Atendente extends Users {
    private final boolean administrador = false;

    private double cashOnHand;

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand += cashOnHand;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void fecharCaixa(){
        System.out.println("Caixa Fechado com sucesso. \nValor final de: " + getCashOnHand());
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
