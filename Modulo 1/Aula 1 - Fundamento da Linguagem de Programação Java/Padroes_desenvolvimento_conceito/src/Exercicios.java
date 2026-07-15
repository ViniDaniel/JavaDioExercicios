import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        //EXERCÍCIO 1
        //Nome e ano de nascimento e imprima

        var baseYear = OffsetDateTime.now().getYear(); //pega o ano atual
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        var nome = scanner.next();
        System.out.println("Digite seu ano de nascimento:");

        var ano = scanner.nextInt();
        var idade = baseYear - ano;
        System.out.printf("Você se chama %s e possui %s anos \n", nome, idade);


        //EXERCÍCIO 2
        //calcular a área de um quadrado
        System.out.println("Digite o lado do quadrado:");
        var lado = scanner.nextFloat();
        var areaQuadrado = lado * 2;
        System.out.printf("A área possui %sm²\n", areaQuadrado);

        //EXERCÍCIO 3
        //calcular a área de um retangulo
        System.out.println("Digite a base do retangulo:");
        var base = scanner.nextFloat();
        System.out.println("Digite a altura do retangulo:");
        var altura = scanner.nextFloat();
        var areaRetangulo = base * altura;
        System.out.printf("A área possui %sm²\n", areaRetangulo);

        //EXERCÍCIO 4
        //Diferença de idade entre pessoas
        System.out.println("Digite o nome da pessoa 1:");
        var nome1 = scanner.next();
        System.out.println("Digite a idade da pessoa 1:");
        var idade1 = scanner.nextInt();

        System.out.println("Digite o nome da pessoa 2:");
        var nome2 = scanner.next();
        System.out.println("Digite a idade da pessoa 2:");
        var idade2 = scanner.nextInt();

        var diferenca = idade1 - idade2;
        if (idade1 < idade2){
            var diferenca1 = idade2 - idade1;
            System.out.printf("%s possui %s anos, e %s possui %s anos.\n A diferença de idades é de %s anos", nome1, idade1, nome2, idade2, diferenca1);
        }else{
            System.out.printf("%s possui %s anos, e %s possui %s anos.\n A diferença de idades é de %s anos", nome1, idade1, nome2, idade2, diferenca);
        }

    }
}
