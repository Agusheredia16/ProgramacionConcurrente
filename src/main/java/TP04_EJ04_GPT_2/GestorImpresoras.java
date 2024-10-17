package TP04_EJ04_GPT_2;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class GestorImpresoras {

    private Semaphore semaforo;

    public GestorImpresoras(int cantImpresoras) {
        semaforo = new Semaphore(cantImpresoras);
    }

    public void imprimir(String nombreCliente, int tiempoImpresion) {

        try {
            semaforo.acquire();
            System.out.println("El cliente " + nombreCliente + " va a usar una impresora");

            Thread.sleep(tiempoImpresion);
        } catch (InterruptedException e) {
            System.out.println("Oh no, alguien ha intentado llamar al hilo mientras estaba esperando a se atendido");
        } finally {
            System.out.println("El cliente " + nombreCliente + " a terminado.");
            semaforo.release();
        }
    }
}
