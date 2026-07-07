import java.util.Scanner;

public class estruturaCondicional {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua Idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        /*
        if (age >= 18) {
            System.out.printf("%s tem %s anos, você pode dirigir \n", name, age);
        } else if (age >=16 && isEmancipated){
            System.out.printf("%s tem %s anos, você pode dirigir pois é emancipado \n", name, age);
        } else {
            System.out.printf("%s você não pode dirigir pois possui %s anos \n", name, age);
        }
        */

        //elvis operator, ele executa em ordem, se for verdade é o primeiro parametro, se não for verdade é o segundo parametro
        /*var canDrive = (age >= 18) || (age >= 16 && isEmancipated);
        var message = canDrive ?
                name + ", você pode dirigir \n" :
                name + ", você não pode dirigir \n";

        System.out.println(message);*/



        //switch case

        System.out.println("Informe um numero de 1 a 7: ");
        var option = scanner.nextInt();
        /*switch (option){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }*/
        var message = switch (option){
          case 1,7 -> {
              var day = option ==1 ? "Domingo" : "Sabado";
              yield String.format("Hoje é %s, fim de semana ", day);
          }
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "Opção Inválida";



        };
        System.out.println(message);

        System.out.println("fim da execução");
    }
}
