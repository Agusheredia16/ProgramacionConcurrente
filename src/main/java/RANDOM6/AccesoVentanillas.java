package RANDOM6;
import java.util.concurrent.Semaphore;
/*
@author agush
 */
public class AccesoVentanillas implements Runnable {
    private Semaphore semaforo;
    private int id;

    public AccesoVentanillas(Semaphore semaforo, int id) {
        this.semaforo = semaforo;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            System.out.println("El hilo " + id + " esta esperando");
            semaforo.acquire();
            System.out.println("El hilo " + id + " esta en siendo atendido");
            Thread.sleep(2000);
            System.out.println("El hilo " + id + " termino de se atendido");
        } catch (InterruptedException ex) {
            //  F 
        }
    }
}
