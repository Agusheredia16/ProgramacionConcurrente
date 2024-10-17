package TP04_EJ04;
import java.util.concurrent.Semaphore;
/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Semaphore semaforo1 = new Semaphore(1);
        Semaphore semaforo2 = new Semaphore(1);
        Semaphore semaforo3 = new Semaphore(1);
        
        Impresora impresora1 = new Impresora("Maq 1");
        Impresora impresora2 = new Impresora("Maq 2");
        Impresora impresora3 = new Impresora("Maq 3");
        
        Thread cliente1 = new Thread(new Cliente(impresora1, impresora2, impresora3, semaforo1, semaforo2, semaforo3), "Cliente 1");
        Thread cliente2 = new Thread(new Cliente(impresora1, impresora2, impresora3, semaforo1, semaforo2, semaforo3), "Cliente 2");
        Thread cliente3 = new Thread(new Cliente(impresora1, impresora2, impresora3, semaforo1, semaforo2, semaforo3), "Cliente 3");
        Thread cliente4 = new Thread(new Cliente(impresora1, impresora2, impresora3, semaforo1, semaforo2, semaforo3), "Cliente 4");
        Thread cliente5 = new Thread(new Cliente(impresora1, impresora2, impresora3, semaforo1, semaforo2, semaforo3), "Cliente 5");
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
        
    }

}
