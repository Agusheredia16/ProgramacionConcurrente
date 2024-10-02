package TP03_EJ02_V2;

/*
@author agush
 */
// Clase principal para ejecutar el programa
public class Main {

    public static void main(String[] args) {
        Vida vida = new Vida(); // Recurso compartido

        // Crear instancias de los hilos
        Thread malzahar = new Thread(new Malzahar(vida), "Malzahar");
        Thread soraka = new Thread(new Soraka(vida), "Soraka");

        // Iniciar los hilos
        malzahar.start();
        soraka.start();

        // Esperar a que ambos hilos terminen
        try {
            malzahar.join();
            soraka.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Vida final: " + vida.getVida());
    }
}
