package TP03_EJ03_V3;

/*
@author agush
 */
public class Comida {

    public synchronized int comer() {
        System.out.println(Thread.currentThread().getName() + " ha empezado a comer");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + " ha dejado de comer");
        return 1;
    }
}
