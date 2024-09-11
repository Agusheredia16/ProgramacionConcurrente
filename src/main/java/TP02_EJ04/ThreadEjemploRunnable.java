package TP02_EJ04;

/*
@author agush
 */
public class ThreadEjemploRunnable implements Runnable {

    private String nombre;

    public ThreadEjemploRunnable(String nombre) {
        this.nombre = nombre;  // Guardamos el nombre del hilo
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + nombre);
        }
        System.out.println("Termina thread " + nombre);
    }

    public static void main(String[] args) {
        ThreadEjemploRunnable mJ = new ThreadEjemploRunnable("Maria Jose");
        ThreadEjemploRunnable jM = new ThreadEjemploRunnable("Jose Maria");
        
        Thread t1 = new Thread(mJ);
        Thread t2 = new Thread(jM);

        t1.start();
        t2.start();

        System.out.println("Termina thread main");
    }
}
