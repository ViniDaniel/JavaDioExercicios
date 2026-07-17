public class Main {
    public static void main(String[] args) {
        IngressoFamilia ingressoFamilia = new IngressoFamilia();
        IngressoMeiaEntrada ingressoMeiaEntrada = new IngressoMeiaEntrada();

        ingressoFamilia.setFilmName("A historia de xablau");
        ingressoFamilia.setPrice(15);
        ingressoFamilia.familyTicket(4);
        ingressoFamilia.setClosedCaptions("Dublado");

        ingressoMeiaEntrada.setPrice(30);
        ingressoMeiaEntrada.setClosedCaptions("Legendado");
        ingressoMeiaEntrada.setFilmName("A volta dos que não foram");

        System.out.println(ingressoFamilia.getFilmName());
        System.out.println(ingressoFamilia.getPrice());
        System.out.println(ingressoFamilia.getValue());
        System.out.println(ingressoFamilia.getClosedCaptions());

        System.out.println("\n-----------------------------------------\n");

        System.out.println(ingressoMeiaEntrada.getFilmName());
        System.out.println(ingressoMeiaEntrada.getPrice());
        System.out.println(ingressoMeiaEntrada.getHalfPrice());
        System.out.println(ingressoMeiaEntrada.getClosedCaptions());



    }
}
