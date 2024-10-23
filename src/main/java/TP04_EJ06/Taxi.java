package TP04_EJ06;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class Taxi {

    private Semaphore viajar = new Semaphore(0);
    private Semaphore llegamos = new Semaphore(0);
    private boolean disponible = true;
    private int tiempoDestino;

    public void tomarTaxi(String nombreP, int tiempoDestino, int nroTaxi) {
        try {
            disponible = false;
            this.tiempoDestino = tiempoDestino;
            System.out.println(nombreP + " toma el taxi " + (nroTaxi + 1));
            viajar.release();
            llegamos.acquire();
        } catch (InterruptedException e) {
        } finally {
            disponible = true;
        }
    }

    public void conducir(int nroTaxi) {
        try {
            viajar.acquire();
            Thread.sleep(tiempoDestino);
            llegamos.release();
            System.out.println("El taxi " + nroTaxi + " ha llegado a destino");
            this.tiempoDestino = 0;
        } catch (InterruptedException e) {
        }
    }
    
    public boolean getDisponible(){
        return disponible;
    }

}
