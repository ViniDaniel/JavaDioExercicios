public record SmsService(String numero) implements MarketingService{

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[SMS] para " + numero + " ->" + mensagem);
    }
}
