public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV  smartTv = new SmartTV();
        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.trocarCanal(50);
        smartTv.ligar();
    }
}
