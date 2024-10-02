package TP03_EJ03;

/*
@author agush
 */
public class Habitad {

    public synchronized boolean comida() {
        try {
            System.out.println(Thread.currentThread() + " esta comiendo");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        return true;
    }

    public synchronized boolean ejercicio() {
        try {
            System.out.println(Thread.currentThread() + " esta corriendo");
            Thread.sleep(15000);
        } catch (InterruptedException e) {
        }
        return true;
    }

    public synchronized boolean hamaca() {
        try {
            System.out.println(Thread.currentThread() + " esta durmiendo");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
        return true;
    }

}
