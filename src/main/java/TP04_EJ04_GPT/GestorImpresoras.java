package TP04_EJ04_GPT;
import java.util.concurrent.Semaphore;

class GestorImpresoras {

    private final Semaphore semaforoImpresoras;

    // Constructor: Recibe el número de impresoras disponibles
    public GestorImpresoras(int numImpresoras) {
        semaforoImpresoras = new Semaphore(numImpresoras);
    }

    // Simula el uso de la impresora por un cliente
    public void imprimir(String cliente, int tiempoImpresion) {
        try {
            // Adquirir el semáforo, esperando si no hay impresoras disponibles
            semaforoImpresoras.acquire();
            System.out.println(cliente + " está utilizando una impresora...");
            Thread.sleep(tiempoImpresion); // Simula el tiempo de impresión
            System.out.println(cliente + " ha terminado de imprimir.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Liberar el semáforo cuando la impresión termina
            semaforoImpresoras.release();
        }
    }
}