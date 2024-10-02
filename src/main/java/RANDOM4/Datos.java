package RANDOM4;
import java.util.concurrent.Semaphore;
/*
@author agush
 */
public class Datos {
    private int dato;
    private Semaphore mutex;

    public Datos(int dato) {
        this.dato = dato;
        mutex = new Semaphore(1);
    }

    public int getDato() {
        return dato;
    }

    public void incrementar() {
        try {
            mutex.acquire();
        } catch (InterruptedException e) {
            //F
        }
        dato = dato + 1;
        mutex.release();
    }

}
