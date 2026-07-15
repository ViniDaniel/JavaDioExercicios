import java.util.Scanner;

public class repeticaoWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        /*while(!name.equals("exit")){ //enquanto não for exit ele roda
            System.out.println("Informe um nome");
            name = scanner.next();
        }*/
       /* while(true){
            System.out.println("Informe um nome");
            name = scanner.next();
            System.out.println(name);

            if (name.equalsIgnoreCase("exit")) break;
        }*/
        //do while ele roda pelo menso 1x antes de verificar se atende a condição
        /*do {
            System.out.println("Informe um nome");
            name = scanner.next();
            System.out.println(name);


        } while (!name.equalsIgnoreCase("exit"));*/

        var i = 0;
        while(args.length > i){
            System.out.println(args[i]);
            i++;
        }

        i = 0;

        System.out.println("=======================================");

        do {
            System.out.println(args[i]);
            i++;
        } while (args.length > i);

    }
}
