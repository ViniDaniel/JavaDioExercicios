import java.util.Scanner;


public class exercicios {


    public static void main(String[] args) {
        //exercicio 1. solicitar um numero e mostar sua tabuada
        System.out.println("exercicio 1 -> Tabuada");
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero para verificar sua tabuada: ");
        var numero = scanner.nextInt();
        System.out.printf("A tabuada de %s é igual a: \n", numero);
        for(var i=1; i <11; i++){
            var multiplo = i * numero;
            System.out.println(multiplo);
        }
        System.out.println("Fim do exercicio 1 \n");


        //exercicio 2. mostrar o imc
        System.out.println("Exercicio 2 -> IMC");
        System.out.println("Digite seu nome: ");
        var nome = scanner.next(); //se usar nextLine ele permite palavras e frases com espaço, o Next puro so pedi uma palavra toda junta sem espaço
        System.out.println("Digite sua altura: ");
        var altura = scanner.nextFloat();
        System.out.println("Digite seu peso: ");
        var peso = scanner.nextFloat();

        var IMC = peso / (altura * altura);
        System.out.println("Seu IMC é igual a: " + IMC);

        if (IMC <= 18.5){
            System.out.printf("%s está abaixo do peso \n", nome);
        } else if (IMC > 18.6 && IMC < 25.0) {
            System.out.printf("%s está no peso ideal \n", nome);
        } else if (IMC >= 25.0 && IMC < 30.0) {
            System.out.printf("%s está um pouco acima do peso \n", nome);
        } else if (IMC >= 30.0 && IMC < 35.0) {
            System.out.printf("%s está com obesidade grau 1 \n", nome);
        } else if (IMC >= 35.0 && IMC < 40.0) {
            System.out.printf("%s está com obesidade grau 2 (severa) \n", nome);
        } else {
            System.out.printf("%s está com obesidade grau 3 (mórbida) \n", nome);
        }

        System.out.println("Fim do exercicio 2 \n");

        /*3. Escreva um código que o usuário entre com um primeiro número,
        um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve
        informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
        incluindo os números informados e em ordem decrescente;
         */

        System.out.println("Exercicio 3 -> Par e Impar entre numeros");
        System.out.println("Digite um numero: ");
        var numero1 = scanner.nextInt();
        System.out.println("Digite um numero maior que o anterior: ");
        var numero2 = scanner.nextInt();



        if (numero1 < numero2){
            System.out.println("Escolha entre par e impar: \nDIGITE (1) para IMPAR e (2) para PAR ");
            var opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Abaixo segue os numeros ímpares entre o primeiro numero digitado e o segundo numero digitado");
                    for(var i=numero2; i>=numero1; i--){
                        if(i % 2 == 0){
                            continue;
                        }
                        System.out.println(i);

                    }
                    break;
                case 2:
                    System.out.println("Abaixo segue os numeros páres entre o primeiro numero digitado e o segundo numero digitado");
                    for(var j=numero2; j>=numero1; j--){
                        if(j % 2 == 0){
                            System.out.println(j);
                        }
                    }
                default:
                    System.out.println("Opção inválida. Selecione entre 1 e 2. ÍMPAR ou PAR");
            }
        } else {
            System.out.println("O segundo numero precisar ser maior que o primeiro numero");
        }

        System.out.println("Fim do exercicio 3 \n");


        /*4. Escreva um código onde o usuário informa um número inicial,
        posteriormente irá informar outros N números, a execução do código irá continuar
        até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão,
        números menores que o primeiro número devem ser ignorados*/

        System.out.println("Exercicio 4 -> Divasão interrompiado por resto diferente de 0");
        System.out.println("Digite um numero: ");
        var numeroInicial = scanner.nextInt();
        while (true){
            System.out.println("Digite um numero qualquer: ");
            var numeroQualquer = scanner.nextInt();

            if(numeroQualquer < numeroInicial){
                System.out.println("Numero menor que seu divisor, numero ignorado");
                continue;
            }

            var resto = numeroQualquer % numeroInicial;

            if(resto != 0){
                System.out.println("O resto deu: " + resto + "\nSistema finalizado");
                break;
            }
            System.out.println("Resto = " + resto);
            System.out.println("Enquanto o resto der 0 o sistema continuará funcionando!");

        }
        System.out.println("Fim do exercicio 4");
    }
}
