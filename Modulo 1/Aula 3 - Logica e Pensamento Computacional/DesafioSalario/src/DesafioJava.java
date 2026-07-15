import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu salário bruto: ");
        var salarioBruto = scanner.nextFloat();
        System.out.println("Digite o valor somado dos benefícios: ");
        var beneficios = scanner.nextFloat();
        var imposto = 0f;

        if(salarioBruto >= 0.01 && salarioBruto <= 1100.00){
            imposto = (0.05f * salarioBruto);
        } else if (salarioBruto > 1100.00 && salarioBruto <= 2500.00){
            imposto = (0.10f * salarioBruto);
        } else if (salarioBruto > 2500.00){
            imposto = (0.15f * salarioBruto);
        } else {
            System.out.println("Valor do salário não poder ser menor que 0,01");
        }
        var salarioLiquido = (salarioBruto - imposto) + beneficios;
        System.out.printf("Seu salário liquido é de: R$%.2f", salarioLiquido);
    }
}
