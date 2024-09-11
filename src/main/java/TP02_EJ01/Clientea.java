package TP02_EJ01;

/*
@author agush
 */
public class Clientea extends Thread {

    @Override
    public void run() {

        System.out.println("soy " + Thread.currentThread().getName());
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }

}
