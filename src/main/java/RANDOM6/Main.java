package RANDOM6;
import java.util.concurrent.Semaphore;
/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(2);
        
        for (int i = 0; i < 4; i++) {
            Thread hilo = new Thread(new AccesoVentanillas(semaforo, i));
            hilo.start();
        }
        
    }

}
