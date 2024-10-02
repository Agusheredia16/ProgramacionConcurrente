package TP03_EJ02;

/*
@author agush
 */
public class GrietaDelInvocador {

    public static void main(String[] args) {
        //Creo un campeon (objeto) al que 2 campeones (van a dañar o curar)
        Katarina katarina = new Katarina();

        //Creo 2 campeones que van a actuar simultaniamente sobre kata
        Malzahar malzaharR = new Malzahar(katarina);
        Soraka sorakaR = new Soraka(katarina);

        //Los convierto en hilos
        Thread malzaharH = new Thread(malzaharR);
        Thread sorakaH = new Thread(sorakaR);

        malzaharH.start();
        sorakaH.start();

        try {
            malzaharH.join();
            sorakaH.join();
            System.out.println("La vida de kata es: " + katarina.getVida());
        } catch (InterruptedException e) {

        }
    }

}
