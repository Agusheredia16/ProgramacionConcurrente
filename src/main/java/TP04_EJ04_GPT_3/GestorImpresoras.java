package TP04_EJ04_GPT_3;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
class GestorImpresoras {

    private final Semaphore[] semaforosImpresoras;

    // Constructor: Recibe el número de impresoras disponibles y crea semáforos binarios
    public GestorImpresoras(int numImpresoras) {
        semaforosImpresoras = new Semaphore[numImpresoras];
        for (int i = 0; i < numImpresoras; i++) {
            semaforosImpresoras[i] = new Semaphore(1); // Semáforo binario: 1 disponible, 0 ocupado
        }
    }

    // Encuentra la primera impresora disponible y la asigna
    public void imprimir(String cliente, int tiempoImpresion, boolean termino) {
        while (!termino) {
            try {
                int impresoraAsignada = -1;
                // Busca una impresora disponible
                for (int i = 0; i < semaforosImpresoras.length; i++) {
                    if (semaforosImpresoras[i].tryAcquire()) { // Intenta adquirir el semáforo (si está disponible)
                        impresoraAsignada = i;
                        System.out.println(cliente + " está usando la impresora " + (i + 1));
                    }
                }

                // Si encontró una impresora, imprime
                if (impresoraAsignada != -1) {
                    Thread.sleep(tiempoImpresion); // Simula el tiempo de impresión
                    System.out.println(cliente + " ha terminado de imprimir en la impresora " + (impresoraAsignada + 1));
                    semaforosImpresoras[impresoraAsignada].release(); // Libera la impresora
                    termino = true;
                } else {
                    System.out.println(cliente + " está esperando por una impresora disponible...");
                    Thread.sleep(1000);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
