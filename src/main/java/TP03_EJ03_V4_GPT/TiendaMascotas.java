package TP03_EJ03_V4_GPT;

/*
@author agush
 */
public class TiendaMascotas {

    public static void main(String[] args) {
        Jaula jaula = new Jaula();

        // Creación de varios hámsteres que comparten la misma jaula
        Thread hamster1 = new Thread(new Hamster("Hámster 1", jaula));
        Thread hamster2 = new Thread(new Hamster("Hámster 2", jaula));
        Thread hamster3 = new Thread(new Hamster("Hámster 3", jaula));

        // Iniciar los hilos
        hamster1.start();
        hamster2.start();
        hamster3.start();

        // Esperar que todos los hilos terminen
        try {
            hamster1.join();
            hamster2.join();
            hamster3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los hámsteres han completado sus actividades.");
    }
}
