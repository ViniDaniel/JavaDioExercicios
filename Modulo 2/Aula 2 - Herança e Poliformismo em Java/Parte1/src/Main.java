public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee() se eu defini como abstrata ela vai xiar aqui
        printEmployee(new Manager());
        printEmployee(new Salesman());


    }

    public static void printEmployee(Employee employee){
        System.out.printf("==========%s==========\n", employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                manager.setCode("234");
                manager.setName("Xablau");
                manager.setSalary(15616);
                manager.setLogin("Alabama123");
                manager.setPassword("125v1z35d");
                manager.setCommission(123);

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommission());
            }
            case Salesman salesman -> {
                salesman.setCode("412");
                salesman.setName("Palamo");
                salesman.setSalary(1600);
                salesman.setPercentPerSold(1);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());

            }
        }
        /*employee.setAge(12);
        ((Manager)employee).setLogin("ddu");
        ((Manager)employee).setPassword("sws54d46");
        System.out.println(((Manager)employee).getLogin());
        System.out.println(((Manager)employee).getPassword());
        essa é uma outra forma de caessar a classe por fora
        */

        /*if (employee instanceof Manager manager) {
            employee.setAge(12);
            employee.setLogin("ddu");
            employee.setPassword("sws54d46");
            System.out.println(employee.getLogin());
            System.out.println(employee.getPassword());
            aqui ele instancia o manager para o employee
            */
        }




    }
}
