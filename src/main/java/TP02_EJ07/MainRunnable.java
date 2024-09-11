package TP02_EJ07;

/*
@author agush
 */
public class MainRunnable {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});

        long initialTime = System.currentTimeMillis();

        CajeroRunnable cajero1 = new CajeroRunnable("Agush", cliente1, initialTime);
        CajeroRunnable cajero2 = new CajeroRunnable("Gonza", cliente2, initialTime);

        Thread thread1 = new Thread(cajero1);
        Thread thread2 = new Thread(cajero2);

        thread1.start();
        thread2.start();
    }
}
