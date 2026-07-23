import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketingService sms = new SmsService("(22) 96423-4521");
        MarketingService email = new EmailService("xablau@exemplo.com");
        MarketingService social = new SocialMediaService("Facebook");
        MarketingService whatsapp = new WhatsappService("(11) 99943-4411");

        boolean rodando = true;

        while(rodando){
            menu();
            String opcao = scanner.nextLine().trim();

            switch (opcao){
                case "1" -> {
                    System.out.println("Digite sua mensagem de marketing: ");
                    String mensagem = scanner.nextLine();
                    enviarParaTodos(mensagem, sms, email, social, whatsapp);

                }
                case "2" -> {
                    System.out.print("Mensagem para SMS: ");
                    sms.enviarMensagem(scanner.nextLine());
                }
                case "3" -> {
                    System.out.print("Mensagem para E-mail: ");
                    email.enviarMensagem(scanner.nextLine());
                }
                case "4" -> {
                    System.out.print("Mensagem para Rede Social: ");
                    social.enviarMensagem(scanner.nextLine());
                }
                case "5" -> {
                    System.out.print("Mensagem para WhatsApp: ");
                    whatsapp.enviarMensagem(scanner.nextLine());
                }
                case "0" -> {
                    rodando = false;
                    System.out.println("Encerrando o sistema de marketing...");
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();

    }
    private static void menu() {
        System.out.println("\n===== MENU DE MARKETING =====");
        System.out.println("1 - Enviar mensagem para TODOS os serviços");
        System.out.println("2 - Enviar mensagem via SMS");
        System.out.println("3 - Enviar mensagem via E-mail");
        System.out.println("4 - Enviar mensagem via Rede Social");
        System.out.println("5 - Enviar mensagem via WhatsApp");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void enviarParaTodos(String mensagem, MarketingService... services){
        for (MarketingService servico : services) {
            servico.enviarMensagem(mensagem);
        }


    }
}
