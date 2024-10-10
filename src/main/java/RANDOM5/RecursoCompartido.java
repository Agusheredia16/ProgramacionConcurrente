package RANDOM5;
import java.util.concurrent.Semaphore;

/*
@author agush
 */
class RecursoCompartido {

    private final Semaphore semaforo = new Semaphore(1); // Semáforo binario

    public void usarRecurso(String nombre) {
        try {
            semaforo.acquire(); // Adquirir el semáforo
            System.out.println(nombre + " está usando el recurso.");
            Thread.sleep(1000); // Simula el tiempo que se usa el recurso
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(nombre + " ha terminado de usar el recurso.");
            semaforo.release(); // Liberar el semáforo
        }
    }
}
