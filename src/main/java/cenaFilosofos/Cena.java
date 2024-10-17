package cenaFilosofos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ulise
 */
public class Cena {

    private Semaphore semTenedor;
    private Semaphore mutexBoolean;
    private boolean rta;

    public Cena() {
        semTenedor = new Semaphore(5);
        mutexBoolean = new Semaphore(1);
    }
    
//    public void buscarTenedor(String nom){
//        try {
//            semTenedor.acquire(2);
//            System.out.println(nom+" agarre tenedor");
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Cena.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//     public void soltarTenedor(String nom){
//          System.out.println(nom+" solte tenedor");
//         semTenedor.release(2);
//    }
    
    
    public boolean agarrarTenedor(String nom) {
        if (semTenedor.tryAcquire(2)) {
            System.out.println(nom+" agarre el tenedor");
            try {
                mutexBoolean.acquire();
                rta = true;
                mutexBoolean.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cena.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                mutexBoolean.acquire();
                rta = false;
                mutexBoolean.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cena.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return rta;
    }

    public void soltarTenedor(String nom) {
            System.out.println(nom+" solte el tenedor");
            semTenedor.release(2);
    }
}