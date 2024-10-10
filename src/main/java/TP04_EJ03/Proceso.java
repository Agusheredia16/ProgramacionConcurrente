package TP04_EJ03;

/*
@author agush
 */
import java.util.concurrent.Semaphore;

class Proceso implements Runnable {

    private final String nombre;
    private final Semaphore semaforoAnterior;
    private final Semaphore semaforoActual;

    public Proceso(String nombre, Semaphore semaforoAnterior, Semaphore semaforoActual) {
        this.nombre = nombre;
        this.semaforoAnterior = semaforoAnterior;
        this.semaforoActual = semaforoActual;
    }

    @Override
    public void run() {
        while (true) {
            try {
                semaforoAnterior.acquire(); // Espera a que el proceso anterior termine
                System.out.println("Ejecutando " + nombre);
                Thread.sleep(1000); // Simula la ejecución del proceso
                semaforoActual.release(); // Libera el semáforo para el siguiente proceso
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
