public record SocialMediaService(String media) implements MarketingService{
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[Rede Social] Para " + media + " ->" + mensagem);
    }
}
