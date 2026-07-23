public class Smartphone implements VideoPlayer, MusicPlayer{
    //em interface, vc pode herdalas mais de uma interface em uma classe
    @Override
    public void playMusic() {
        System.out.println("O celular estáTocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O celular está pausando a  musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O celular está parando a  musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O celular está rodando a  video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O celular está pausando a  video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O celular está parando a  video");
    }
}
