package TP04_EJ04_Ulises;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
@author agush
 */
public class Impresora {

    private Semaphore mutex;
    private char nombre;

    public Impresora(char nom) {
        nombre = nom;
        mutex = new Semaphore(1);
    }

    public char getNombre() {
        return nombre;
    }

    public void adquirirImpresora() {
        try {
            mutex.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Impresora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean intentarAdquirirImpresora() {
        return mutex.tryAcquire();
    }

    public void liberarImpresora() {
        mutex.release();
    }

}
