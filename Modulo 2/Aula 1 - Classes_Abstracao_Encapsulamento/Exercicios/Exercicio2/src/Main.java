import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n------------Menu do carro-------------");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar a esquerda");
            System.out.println("6 - Virar a direita");
            System.out.println("7 - verificar velocidade");
            System.out.println("8 - Trocar Marcha");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1: carro.ligar(); break;
                case 2: carro.desligar(); break;
                case 3: carro.acelerar(); break;
                case 4: carro.desacelerar(); break;
                case 5: carro.virar("esquerda"); break;
                case 6: carro.virar("direita"); break;
                case 7: carro.verificarVelocidade(); break;
                case 8:
                    System.out.println("Digite a marcha desejada (0 a 6): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                case 0:
                    System.out.println("Encerrando sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
        scanner.close();
    }
}
