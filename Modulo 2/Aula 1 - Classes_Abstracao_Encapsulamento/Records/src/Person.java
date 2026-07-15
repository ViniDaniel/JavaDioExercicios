public record Person(String name, int age) {
    /*records é uma classe imutavel, voce cria ele uma vez e as outras classes
    são poderão o ler
     Ele é util  para fazer validação de dados, recebe na main o dado,
      ele lê se está valido e retorn se estiver valido*/
    public String getInfo(){
        return "Name: " + name + " age: " + age;
    }

    public Person(String name) {
        this(name, 0);
    }
}
