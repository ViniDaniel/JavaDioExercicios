public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Atendente atendente = new Atendente();


        System.out.println("-------------------------------GERENTE---------------------------\n");
        gerente.setName("Alabama");
        System.out.println(gerente.getName());

        gerente.setEmail("alabama@gmail.com");
        System.out.println(gerente.getEmail());

        gerente.setPassword("123");
        System.out.println(gerente.getPassword());
        System.out.println(gerente.isAdministrador());
        System.out.println("Relatorio Inicial" + gerente.financialReport(vendedor));

        gerente.realizarLogin("alabaa@gmail.com", "123");
        gerente.realizarLogout();
        gerente.alterarSenha("123", "456");

        System.out.println("\n---------------------VENDEDOR------------------------\n");

        vendedor.setName("Xumbrega");
        System.out.println(vendedor.getName());

        vendedor.setEmail("xumbrega@gmail.com");
        System.out.println(vendedor.getEmail());

        vendedor.setPassword("568498");
        System.out.println(vendedor.getPassword());
        System.out.println(vendedor.isAdministrador());

        vendedor.realizarLogin("fse@gmail.com", "56848");
        vendedor.realizarLogout();
        vendedor.alterarSenha("568498", "456");

        System.out.println("\n---------------------Vendas do Vendedor------------------------\n");

        vendedor.realizarVendas("Banana", 25, 5);
        vendedor.realizarVendas("Abacate", 6, 1);
        vendedor.realizarVendas("Pêssego", 40.0, 10);
        vendedor.realizarVendas("Batata", 3, 8);
        vendedor.realizarVendas("Morango", 10, 3);

        System.out.println("\n---------------------Fim das Vendas do Vendedor------------------------\n");

        System.out.println("\n---------------------Gets  do Vendedor------------------------\n");

        System.out.println(vendedor.getSalesVolume());
        System.out.println(vendedor.getSales());

        System.out.println("\n---------------------Relatorio do gerente------------------------\n");

        System.out.println("\nRelatorio Final de vendas gerado pelo gerente com base nas vends do vendedor\n" + gerente.financialReport(vendedor));





        System.out.println("-------------------------------atendente---------------------------\n");
        atendente.setName("Moana");
        System.out.println(atendente.getName());

        atendente.setEmail("atendente@gmail.com");
        System.out.println(atendente.getEmail());

        atendente.setPassword("111");
        System.out.println(atendente.getPassword());
        System.out.println(atendente.isAdministrador());


        atendente.realizarLogin("atendente@gmail.com", "111");
        atendente.realizarLogout();
        atendente.alterarSenha("111", "9999");


        atendente.setCashOnHand(500);
        System.out.println("Caixa: R$" + atendente.getCashOnHand());
        atendente.fecharCaixa();


    }
}
