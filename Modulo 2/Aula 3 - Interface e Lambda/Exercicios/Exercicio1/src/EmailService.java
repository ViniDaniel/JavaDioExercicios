public record EmailService(String email) implements MarketingService{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[E-Mail] para " + email + " ->" + mensagem);
    }
}
