

public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro(){
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar(){
        if (ligado){
            System.out.println("O carro já está ligado");
            return;
        }
        ligado = true;
        System.out.println("Carro ligado");
    }

    private boolean verificarLigado(){
        if(!ligado){
            System.out.println("O carro está desligado, ligue-o primeiro");
            return false;
        }
        return true;
    }

    public void desligar(){
        if(!verificarLigado()) return;

        if (marcha != 0 || velocidade != 0){
            System.out.println("Só é possível desligar o carro em ponto morto e com velocdade 0.");
            return;
        }
        ligado = false;
        System.out.println("Carro desligado");
    }



    public void acelerar(){
        if (!verificarLigado()) return;

        if (marcha == 0){
            System.out.println("Carro está em ponto morto, não é possível acelerar");
            return;
        }

        int novaVelocidade = velocidade + 5;
        int limiteMaximo = limiteSuperiorMarcha(marcha);

        if(novaVelocidade > 120){
            System.out.println("Velocidade máxima de 120km/h atingida");
            return;
        }

        if (novaVelocidade > limiteMaximo){
            System.out.printf("Velocidade máxima por marcha atual atingida (%s Km/h). \nTroque de marcha para continuar acelerando", limiteMaximo);
            return;
        }
        velocidade = novaVelocidade;

        System.out.printf("Acelerando... Velocidade atual está em %s Km/h", velocidade);
    }

    public void desacelerar(){
        if(!verificarLigado()) return;

        if(velocidade == 0){
            System.out.println("O carro ja está parado");
            return;
        }
        int novaVelocidade = velocidade -5;
        int limiteInferior = limiteInferiorMarcha(marcha);

        if(novaVelocidade < limiteInferior){
            System.out.printf("Velocidade minima da marcha atual atindida %s Km/h. \nReduza a marcha para diminuir a velocidade", limiteInferior);
            return;
        }
        velocidade = novaVelocidade;
        System.out.println("Reduzindo... velocidade atual: " + velocidade + "km/h");
    }

    public void trocarMarcha(int novaMarcha) {
        if (!verificarLigado()) return;

        if(novaMarcha < 0 || novaMarcha > 6 ){
            System.out.println("Marcha inválida");
            return;
        }

        if(Math.abs(novaMarcha - marcha) > 1) {
            System.out.println("Não pode pular marcha");
            return;
        }
        if(novaMarcha != 0){
            int min = limiteInferiorMarcha(novaMarcha);
            int max = limiteSuperiorMarcha(novaMarcha);

            if (velocidade < min || velocidade > max){
                System.out.printf("Velocidade atual %s Km/h incopativel com a marcha %s faixa %s - %s km/h.", velocidade, novaMarcha, min, max);
                return;
            }

        }

        marcha = novaMarcha;
        System.out.println("Marcha atual: " + (marcha ==0 ? "ponto morto" : marcha + "ª"));

    }

    public void virar(String direcao){
        if(!verificarLigado()) return;

        if (velocidade < 1 || velocidade > 40){
            System.out.println("Só é possível virar com velocidade entre 1km/h e 40km/h.");
            return;
        }
        System.out.printf("Virando para a %s. \n", direcao);

    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + "km/h | Marcha: "
                + (marcha == 0 ? "ponto morto" : marcha + "ª"));
    }

    private int limiteInferiorMarcha(int m){
        switch (m){
            case 1: return 0;
            case 2: return 20;
            case 3: return 40;
            case 4: return 60;
            case 5: return 80;
            case 6: return 100;
            default: return 0;
        }
    }

    private int limiteSuperiorMarcha(int m){
        switch (m){
            case 1: return 20;
            case 2: return 40;
            case 3: return 60;
            case 4: return 80;
            case 5: return 100;
            case 6: return 120;
            default: return 0;
        }
    }

    public int getVelocidade(){
        return velocidade;
    }

    public int getMarcha(){
        return marcha;
    }
    public boolean isLigado(){
        return ligado;
    }



}
