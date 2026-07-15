import java.util.Scanner;

public class repeticaoFor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        /*for (;;){
            System.out.println("Digite um nome: ");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }*/
        for (var i = 0; i <=100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
