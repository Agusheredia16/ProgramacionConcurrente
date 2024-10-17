package TP04_EJ04_V2;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class GestorImpresoras {

    private Semaphore[] impresoras;

    public GestorImpresoras(int cantidadImpresoras) {
        impresoras = new Semaphore[cantidadImpresoras];

        for (int i = 0; i < cantidadImpresoras; i++) {
            impresoras[i] = new Semaphore(1);
        }
    }

    public void imprimir(String nombre, int tiempoImpresion, boolean termino) {
        try {
            int impresoraDisponible = -1;
            while (!termino) {
                //Aca comprobamos si hay impresora disponible
                for (int i = 0; i < impresoras.length; i++) {
                    if (impresoras[i].tryAcquire()) {
                        System.out.println("El cliente " + nombre + " va a usar la impresora " + (i + 1));
                        impresoraDisponible = i;
                    }
                }

                if (impresoraDisponible != -1) {
                    Thread.sleep(tiempoImpresion);
                    System.out.println("El cliente " + nombre + " ha terminado");
                    impresoras[impresoraDisponible].release();
                    termino = true;
                } else {
                    Thread.sleep(500);
                    System.out.println(nombre + " espera pacientemente");
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            //f
        }
    }

}
