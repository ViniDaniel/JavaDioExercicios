import java.util.Scanner;
//se colocar import java.util.* ele pega todas as classes deno de util, pesa o codigo



public class Main {

    //variável global, uso do capslock é pera tratala como variável constante
    private final static String WELCOME_MESSAGE = "Seja bem-vindo!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner funciona parecido com o input, antes de usar precisa reservar um lugara ele para evitar que de erro
        //a também a possibilidade de declarar variavel com o ar, ao inves de chama 2x, segue exemplo abaixo
        //var scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        System.out.println("Informe seu nome");
        String name = scanner.next();
        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Olá " + name + " Sua iadade é " + idade);

        //outra forma de usar o print com o format agora
         System.out.printf("Fala %s ta com %s agora né \n", name, idade); //usa o %s para ele entender que é uma variavel, ele pega em ordem
    }
}


/*Classe (a Main no caso) sempre inicia com letra maiscula
* Por convenção o Java trabalha com CamelCase
* para trabalhar com packads vc coloca  dominio ao contario, por exemplo dio.com.br fica br.com.dio
* */