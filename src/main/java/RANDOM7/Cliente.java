package RANDOM7;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class Cliente implements Runnable {

    private Cajera cajera;
    private int nroCliente;
    private Semaphore semaforo;

    public Cliente(Cajera cajera, int nroCliente, Semaphore semaforo) {
        this.cajera = cajera;
        this.nroCliente = nroCliente;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        try {
            System.out.println("El cliente " + nroCliente + " espera a ser atendido");
            semaforo.acquire();
            cajera.atenderCliente();
        } catch (InterruptedException ex) {
            //F
        } finally {
            System.out.println("El cliente " + nroCliente + " deja de ser atendido");
            semaforo.release();
        }
    }
}
