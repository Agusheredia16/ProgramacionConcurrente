package RANDOM7;
import java.util.concurrent.Semaphore;
/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(1);
        Cajera cajera = new Cajera();
        
        Thread cliente1 = new Thread(new Cliente(cajera, 1, semaforo), "Cliente 1");
        Thread cliente2 = new Thread(new Cliente(cajera, 2, semaforo), "Cliente 2");
        Thread cliente3 = new Thread(new Cliente(cajera, 3, semaforo), "Cliente 3");
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
    }

}
