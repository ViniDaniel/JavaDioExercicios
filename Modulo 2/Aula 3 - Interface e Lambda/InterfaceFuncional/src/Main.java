import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");
        List<User> users = List.of(
                new User("Maria", 22),
                new User("João", 33),
                new User("Alabama", 88)
        );
       /* var consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);
            }/*

           /* @Override
            public Consumer<User> andThen(Consumer<? super User> after) {
                return Consumer.super.andThen(after);
            }*/
       // };
        /*
        users.forEach(consumer);
        */
        //um maneira para simplificar o codigo do accpet é com um função lambda
        users.forEach( user -> {
            System.out.println(user);
        });

        /*outra maneira mais simples ainda é assim
        * users.forEach(System.out::println);*/



        printStringValue(User::name, users); //chama pelo nome
        printStringValue(user -> String.valueOf(user.age()), users); //chama pela idade
        printStringValue(Record::toString, users); //chama o objeto completo

        }
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u > System.out.println(callback.apply(u)));

    }
}
