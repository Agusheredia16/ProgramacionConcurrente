package TP03_EJ03_V3;

/*
@author agush
 */
public class Rueda {

    public synchronized int correr() {
        System.out.println(Thread.currentThread().getName() + " ha empezado a correr");
        try {
            Thread.sleep(1250);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " ha terminado de correr");
        return 1;
    }
}
