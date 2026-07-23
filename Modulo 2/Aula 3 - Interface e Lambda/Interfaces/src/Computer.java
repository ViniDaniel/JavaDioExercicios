public class Computer implements VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O computador estáTocando musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando a  musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador está parando a  musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O computador está rodando a  video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando a  video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador está parando a  video");
    }
}
