public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        //aumentando e diminuindo volume
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        // mostrando status de tv ligada,canal,volume
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual : "+smartTv.canal);
        System.out.println("Volume Atual : "+smartTv.volume);

        //verificando se esta ligada
        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);

        //desligando
        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + smartTv.ligada);
    }
}
