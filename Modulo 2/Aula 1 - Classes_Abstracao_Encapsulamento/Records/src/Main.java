public class Main {
    public static void main(String[] args) {
        var person = new Person("João", 15);
        System.out.println(person); //le tudo
        System.out.println(person.getInfo());
        System.out.println(person.name()); //le so o nome
    }
}
