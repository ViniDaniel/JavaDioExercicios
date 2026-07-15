import java.util.Scanner;

public class Main {

    private static  Conta conta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = scanner.next();
        System.out.println("Faça um primeiro depósito para começar a usar a conta: ");
        var deposito = scanner.nextFloat();
        conta = new Conta(deposito);

        while (true){
            System.out.println("Seja bem vindo " + nome + " ao banco xxx. Escolha uma das oções para começar a usar o banco");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("7 - Sair");

            var choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Saldo atual: R$" + conta.ConsultarSaldo());
                    break;
                case 2:
                    System.out.println("Cheque especial disponível: R$" + conta.ConsultarChequeEspecial());
                    break;
                case 3: {
                    System.out.println("Digite um valor que deseja depositar");
                    var valor = scanner.nextFloat();
                    conta.depositar(valor);
                    break;
                }
                case 4: {
                    System.out.println("Digite um valor que deseja sacar");
                    var valor = scanner.nextFloat();
                    conta.sacar(valor);
                    break;
                }
                case 5: {
                    System.out.println("Digite o valor do boleto");
                    var valor = scanner.nextFloat();

                    conta.pagarBoleto(valor);
                    break;
                }
                case 6:
                    System.out.println("Está usando cheque especial? " + conta.chequeEspecialUsado());
                    break;
                case 7:
                    System.out.println("Obrigado por usar nosso serviços " + nome);
                    System.exit(0);

                default:
                    System.out.println("Opção inválida");
            }

        }
    }
}
