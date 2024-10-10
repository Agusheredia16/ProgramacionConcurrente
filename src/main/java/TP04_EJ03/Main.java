package TP04_EJ03;
/*
@author agush
*/
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        // Semáforos para la sincronización
        Semaphore semaforoP1 = new Semaphore(1); // Permitir que P1 inicie primero
        Semaphore semaforoP3 = new Semaphore(0); // P3 espera a que P1 termine
        Semaphore semaforoP2 = new Semaphore(0); // P2 espera a que P3 termine

        // Crear los hilos
        Thread p1 = new Thread(new Proceso("P1", semaforoP1, semaforoP3));
        Thread p3 = new Thread(new Proceso("P3", semaforoP3, semaforoP2));
        Thread p2 = new Thread(new Proceso("P2", semaforoP2, semaforoP1));

        // Iniciar los hilos
        p1.start();
        p3.start();
        p2.start();
    }
}
