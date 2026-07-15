import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        /*var male = new Person();
        male.setName("João");
        male.setAge(25);

        var female = new Person();
        female.setName("Maria");
        female.setAge(20);*/

        var male = new Person("João");

        male.incAge();

        var female = new Person("Maria");

        female.incAge();

        System.out.printf("Nome masculino: %s, Idade: %s \n", male.getName(), male.getAge());
        System.out.printf("Nome feminino: %s, Idade: %s", female.getName(), female.getAge());
    }
}
