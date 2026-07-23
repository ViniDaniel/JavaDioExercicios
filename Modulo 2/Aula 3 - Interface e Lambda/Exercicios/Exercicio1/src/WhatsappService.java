public record WhatsappService(String numero) implements MarketingService {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[WhatsApp] para " + numero + " ->" + mensagem);
    }
}
