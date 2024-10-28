public class SmartTV {
    boolean ligada = false;
    int volume = 25, canal = 1;

    public void ligar(){
        ligada = !ligada;
        System.out.println("TV ligada? "+ ligada);
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Volume: "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: "+ volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal: "+ canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal: "+ canal);
    }

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: "+ canal);
    }
}
