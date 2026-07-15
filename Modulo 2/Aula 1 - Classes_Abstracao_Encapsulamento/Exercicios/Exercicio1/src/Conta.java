import java.util.Scanner;

public class Conta {
    Scanner scanner = new Scanner(System.in);

     private float saldo;


    private final float limiteChequeEspecial;

    private float chequeEspecial;

    private float taxaPendente = 0f;


    private void registrarUsoChequeEspecial(float valorUsado) {
        float taxa = valorUsado * 0.20f;
        taxaPendente += taxa;
    }

    public Conta(float depositoInicial){
        this.saldo = depositoInicial;
        if(depositoInicial <= 500){
            this.limiteChequeEspecial = 50f;
        } else {

            this.limiteChequeEspecial = depositoInicial * 0.5f;
        }
        this.chequeEspecial = this.limiteChequeEspecial;
    }

    public float ConsultarSaldo() {
        return saldo;
     }

    public float ConsultarChequeEspecial() {
        return chequeEspecial;
    }

    public void sacar(float valor){
        if(valor > saldo){
            System.out.println("Valor saque é maior que o valor em conta, deseja usar o cheque especial? (sim / nao)");
            var resposta = scanner.next();
            if(resposta.equalsIgnoreCase("sim") && chequeEspecial + saldo >= valor){
                float faltante = valor - saldo;
                chequeEspecial -= faltante;
                registrarUsoChequeEspecial(faltante);
                saldo = 0f;
                System.out.println("Saque de R$" + valor + " efetuado com sucesso. \nValor do cheque especial está em R$" + chequeEspecial+ "\nValor do saldo em conta R$" + saldo);
            } else if (resposta.equalsIgnoreCase("sim") && chequeEspecial + saldo < valor) {
                System.out.println("Valor do cheque especial e do saldo somados é insuficiente para efetuar o saque. \nValor do cheque especial R$" + chequeEspecial + "\nValor do saldo em conta R$" + saldo + "\nValor do saque R$" + valor);
            } else {
                System.out.println("Saque cancelado!");
            }
        } else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso! Valor em conta R$" + saldo);
        }
    }

    public void depositar(float valor){
        if (valor <= 0) {
            System.out.println("Valor Inválido! Digite um valor maior que zero.");
            return;
        }

        if (taxaPendente > 0) {
            if (valor >= taxaPendente) {
                float valorLiquido = valor - taxaPendente;
                System.out.println("Taxa de cheque especial de R$" + taxaPendente + " cobrada.");
                taxaPendente = 0f;
                saldo += valorLiquido;
            } else {
                taxaPendente -= valor;
                System.out.println("Depósito usado para abater taxa pendente. Taxa restante: R$" + taxaPendente);
            }
        } else {
            saldo += valor;
        }
    }

     public void pagarBoleto(float valor){
         if(valor > saldo){
             System.out.println("Valor do boleto é maior que o valor em conta, deseja usar o cheque especial? (sim / nao)");
             var resposta = scanner.next();
             if(resposta.equalsIgnoreCase("sim") && chequeEspecial + saldo >= valor){
                 float faltante = valor - saldo;
                 chequeEspecial -= faltante;
                 registrarUsoChequeEspecial(faltante);
                 saldo = 0f;
                 System.out.println("Boleto no valor de R$" + valor + " pago com sucesso. \nValor do cheque especial está em R$" + chequeEspecial);
             } else if (resposta.equalsIgnoreCase("sim") && chequeEspecial + saldo < valor) {
                 System.out.println("Valor do cheque especial é insuficiente para pagar essa conta. \nValor do cheque especial R$" + chequeEspecial + "\nValor do saldo em conta R$" + saldo + "\nValor do boleto R$" + valor);
             } else {
                 System.out.println("Pagamento cancelado!");
             }
         } else {
             saldo -= valor;
             System.out.println("Boleto pago com sucesso! Valor em conta R$" + saldo);
         }
     }

     public boolean chequeEspecialUsado(){
        return chequeEspecial < limiteChequeEspecial;
     }









}
