public sealed abstract class Employee permits Manager, Salesman {
    /*tratando ela como abstrata, so posso acessala extendo-a de outra
    * o sealed evita com que uma classe aleatoria acesse ela
    * permits diz que pode acessala, no entanto essa classe que vai acessala, tem q dizer se é final, selada ou não selada*/
    private String code;
    private String name;
    private String address;
    private int age;

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
