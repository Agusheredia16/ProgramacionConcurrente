package TP04_EJ03_V2;
import java.util.concurrent.Semaphore;
import java.util.Scanner;
/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Semaphore semaforo = new Semaphore(1);
        Turno turno = new Turno("Hilo 1");
        
        Thread hilo1 = new Thread(new Proceso(turno, semaforo), "Hilo 1");
        Thread hilo2 = new Thread(new Proceso(turno, semaforo), "Hilo 2");
        Thread hilo3 = new Thread(new Proceso(turno, semaforo), "Hilo 3");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

}
