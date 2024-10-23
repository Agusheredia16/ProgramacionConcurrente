package TP04_EJ06;

/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Taxi[] taxis = new Taxi[3];
        
        
        Pasajero gonza = new Pasajero("Gonzalo", 2000, taxis);
        Pasajero jere = new Pasajero("Jeremias", 3000, taxis);
        
        Taxista tax1 = new Taxista("Roberto", taxis[0] = new Taxi(), 1);
        Taxista tax2 = new Taxista("Federico", taxis[1] = new Taxi(), 2);
        Taxista tax3 = new Taxista("Pepe", taxis[2] = new Taxi(), 3);

        Thread hilo1 = new Thread(gonza);
        Thread hilo2 = new Thread(jere);
        Thread hilo3 = new Thread(tax1);
        Thread hilo4 = new Thread(tax2);
        Thread hilo5 = new Thread(tax3);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }

}
