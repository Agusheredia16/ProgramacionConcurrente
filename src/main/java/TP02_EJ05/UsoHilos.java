package TP02_EJ05;

/*
@author agush
 */
class UsoHilos {

    public static void main(String[] args) {
        System.out.println("Hilo MAIN iniciando.");
        MiHilo mh1 = new MiHilo("#1");
        MiHilo mh2 = new MiHilo("#2");       //Linea agregada para hacer el 5c)
        Thread nuevoHilo1 = new Thread(mh1);
        Thread nuevoHilo2 = new Thread(mh2);      //Linea agregada para hacer el 5c)
        nuevoHilo1.start();
        nuevoHilo2.start();                           //Linea agregada para hacer el 5c)
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}

/*  Ejemplo de como se interrumpe a un hilo dormido. Ej 5) a.

class MiHilo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Hilo durmiendo...");
            Thread.sleep(5000);  // Duerme el hilo por 5 segundos
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MiHilo());
        t.start();

        // Interrumpimos el hilo después de 2 segundos
        try {
            Thread.sleep(2000); // Pausa para dar tiempo al otro hilo de dormirse
            t.interrupt();      // Interrumpe el hilo t
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


 */
