package TP04_EJ07;

/*
@author agush
 */
public class Mozo implements Runnable {

    private Comedor comedor;
    private int maxPersonasAtender;

    public Mozo(Comedor comedor) {
        this.comedor = comedor;
    }

    @Override
    public void run() {
        comedor.atender();
    }

}
