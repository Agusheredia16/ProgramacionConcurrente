package TP02_EJ05;

/*
@author agush
 */
class MiHiloThread extends Thread {

    String nombreHiloT;

    MiHiloThread(String nombreHiloT) {
        this.nombreHiloT = nombreHiloT;
    }

    @Override
    public void run() {
        System.out.println("Comenzando " + nombreHiloT);
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("En " + nombreHiloT + ", recuento: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo " + nombreHiloT + " interrumpido");
        }
        System.out.println("Hilo " + nombreHiloT + " terminado");
    }

}
