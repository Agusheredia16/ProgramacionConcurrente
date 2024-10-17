package TP04_EJ04;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
@author agush
 */
public class Cliente implements Runnable {

    private Impresora impresora1;
    private Impresora impresora2;
    private Impresora impresora3;
    private Semaphore semaforo1;
    private Semaphore semaforo2;
    private Semaphore semaforo3;
    private boolean termino = false;

    public Cliente(Impresora impresora1, Impresora impresora2, Impresora impresora3, Semaphore semaforo1, Semaphore semaforo2, Semaphore semaforo3) {
        this.impresora1 = impresora1;
        this.impresora2 = impresora2;
        this.impresora3 = impresora3;
        this.semaforo1 = semaforo1;
        this.semaforo2 = semaforo2;
        this.semaforo3 = semaforo3;
    }

    @Override
    public void run() {
        while (!termino) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized (this) {
                if (!impresora1.estaOcupada()) {
                    try {
                        impresora1.ocupar();
                        semaforo1.acquire();
                        System.out.println("El " + Thread.currentThread().getName() + " usara la " + impresora1.getNroMaquina());
                        Thread.sleep(3000);
                        System.out.println("El " + Thread.currentThread().getName() + " dejara de usar la " + impresora1.getNroMaquina());

                    } catch (InterruptedException ex) {
                    } finally{
                        termino = true;
                    }

                } else if (!impresora2.estaOcupada()) {
                    try {
                        impresora2.ocupar();
                        semaforo2.acquire();
                        System.out.println("El " + Thread.currentThread().getName() + " usara la " + impresora2.getNroMaquina());
                        Thread.sleep(3000);
                        System.out.println("El " + Thread.currentThread().getName() + " dejara de usar la " + impresora2.getNroMaquina());

                    } catch (InterruptedException ex) {
                    } finally{
                        termino = true;
                    }

                } else if (!impresora3.estaOcupada()) {
                    try {
                        impresora3.ocupar();
                        semaforo3.acquire();
                        System.out.println("El " + Thread.currentThread().getName() + " usara la " + impresora3.getNroMaquina());
                        Thread.sleep(3000);
                        System.out.println("El " + Thread.currentThread().getName() + " dejara de usar la " + impresora3.getNroMaquina());

                    } catch (InterruptedException ex) {
                    } finally{
                        termino = true;
                    }

                } else {
                    System.out.println("El " + Thread.currentThread().getName() + " esta esperando a que se desocupe una maquina");
                }
            }
        }
    }

}
