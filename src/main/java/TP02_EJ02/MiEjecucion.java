package TP02_EJ02;

/*
@author agush
 */
public class MiEjecucion extends Thread {

    @Override
    public void run() {
        ir();
    }

    public void ir() {
        hacerMas();
    }

    public void hacerMas() {
        System.out.println("En la pila");
    }

}
