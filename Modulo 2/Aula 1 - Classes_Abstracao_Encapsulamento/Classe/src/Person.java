import java.time.OffsetDateTime;

public class Person {

    /*private String name;

    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }  forma mais comum de ser feita, outra maneira abaixo com outras regras*/

    private final String name; //isso é uma constante, inalteração fora da criação
    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear(); //regra onde buscra pelo ultimo ano

    public Person(String name){
        this.name = name;
        this.age = 1;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    } //caso tenha se passado 1 ano ele incrementa em +1
}
