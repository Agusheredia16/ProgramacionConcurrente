package TP03_EJ04;

/*
@author agush
 */
public class Main {

    public static void main(String[] args) {
        Area area = new Area();
        
        Thread agus = new Thread(new Visitante(area), "Agus");
        Thread gonza = new Thread(new Visitante(area), "Gonza");
        Thread jere = new Thread(new Visitante(area), "Jere");
        Thread joako = new Thread(new Visitante(area), "Joako");
        
        agus.start();
        gonza.start();
        jere.start();
        joako.start();
        
    }
}
