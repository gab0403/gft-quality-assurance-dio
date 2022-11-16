public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("Tv ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Status -> Tv ligada? " + smartTV.ligada);
        
        smartTV.desligar();
        System.out.println("Status -> Tv ligada? " + smartTV.ligada);


        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Status -> Volume atual: " + smartTV.volume);

        smartTV.mudarCanal(13);

    }
}
