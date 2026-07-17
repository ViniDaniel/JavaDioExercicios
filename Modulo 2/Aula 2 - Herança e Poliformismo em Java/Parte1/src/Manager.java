public non-sealed class Manager extends Employee {
    /*extends puxa o que está na outra class
    * non-sealed diz que ela não é selada e permitir sua extensão a um pai selado*/
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    private String login;

    private String password;

    private double commission;
}
