import java.util.Scanner;

public class OperadoresDeAtribuicaoELogicos {
    public static void main(String[] args) {
        //operador boleando para verificação de certo e errado
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?");
        var result = scanner.nextInt();
        var isRight = result == 4; //a também o isWrong que verifica se está errado
        System.out.printf("O resulstado é 4! Voê acertou? %s \n", isRight);


        System.out.println("Qual sua idade? ");
        var age = scanner.nextInt();
        var canDrive = age >= 18;
        System.out.printf("Você está apto para dirigir? %s \n", canDrive);
    }
}
