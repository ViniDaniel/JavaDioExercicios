import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        TaxCalculation taxCalculation = null;

        boolean rolling = true;

        int menu;
        while (rolling){

            System.out.println("\n======Menu Geral=======");
            System.out.println("1 - Calcular taxa e valor final do Alimento");
            System.out.println("2 - Calcular taxa e valor final da Saúde");
            System.out.println("3 - Calcular taxa e valor final do Bem-Estar");
            System.out.println("4 - Calcular taxa e valor final do Vestuário");
            System.out.println("5 - Calcular taxa e valor final da Cultura");
            System.out.println("6 - Sair do Sistema");
            System.out.println("Escolha uma opção: ");

            menu = scanner.nextInt();


            if(menu == 1){
                taxCalculation = foodCalculation();
                System.out.printf("Imposto: %.2f%n", taxCalculation.getTax());
                System.out.printf("Valor final: %.2f%n", taxCalculation.getFinalValue());

            } else if (menu == 2) {
                taxCalculation = healthCalculation();
                System.out.printf("Imposto: %.2f%n", taxCalculation.getTax());
                System.out.printf("Valor final: %.2f%n", taxCalculation.getFinalValue());
            }  else if (menu == 3) {
                taxCalculation = wellBeingCalculation();
                System.out.printf("Imposto: %.2f%n", taxCalculation.getTax());
                System.out.printf("Valor final: %.2f%n", taxCalculation.getFinalValue());
            }  else if (menu == 4) {
                taxCalculation = clothingCalculation();
                System.out.printf("Imposto: %.2f%n", taxCalculation.getTax());
                System.out.printf("Valor final: %.2f%n", taxCalculation.getFinalValue());
            }  else if (menu == 5) {
                taxCalculation = cultureCalculation();
                System.out.printf("Imposto: %.2f%n", taxCalculation.getTax());
                System.out.printf("Valor final: %.2f%n", taxCalculation.getFinalValue());
            } else if (menu == 6) {
                rolling = false;
                System.out.println("Sistema finalizado!");
                continue;
            } else {
                System.out.println("Opção inválida! Escolha uma opção de 1 a 6!");
                continue;
            }
            System.out.println(taxCalculation.getTax());
        }
    }
    private static TaxCalculation foodCalculation(){
        System.out.println("Informe o valor do alimento: ");
        var value = scanner.nextDouble();
        return new Food(value);

    }
    private static TaxCalculation healthCalculation(){
        System.out.println("Informe o valor do plano de saúde: ");
        var value = scanner.nextDouble();
        return new Health(value);
    }
    private static TaxCalculation wellBeingCalculation(){
        System.out.println("Informe o valor do item de bem-estar: ");
        var value = scanner.nextDouble();
        return new WellBeing(value);
    }
    private static TaxCalculation clothingCalculation(){
        System.out.println("Informe o valor da sua vestimenta: ");
        var value = scanner.nextDouble();
        return new Clothing(value);
    }
    private static TaxCalculation cultureCalculation(){
        System.out.println("Informe o valor do item de cultura: ");
        var value = scanner.nextDouble();
        return new Culture(value);
    }

}
