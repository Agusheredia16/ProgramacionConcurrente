package TP02_EJ06;

import java.util.Random;

/*
@author agush
 */
public class Corredor implements Runnable {

    String nombre;
    int distRecorrida;

    Corredor(String nombre) {
        this.nombre = nombre;
        this.distRecorrida = 0;
    }

    void aumentarDR(int distRecorrida) {
        this.distRecorrida = this.distRecorrida + distRecorrida;
    }

    int mostrarDistancia() {
        return distRecorrida;
    }

    @Override
    public void run() {
        int random = 0;
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(100);
                random = (int) (Math.random() * 10);
                System.out.println("Soy " + nombre + " avance: " + random);
                aumentarDR(random);
            }
        } catch (InterruptedException e) {
            System.out.println("EL CORREDOR " + nombre + " CAYO");
        } finally {
            System.out.println("El corredor " + nombre + " corrio:" + mostrarDistancia());
        }
    }

}
