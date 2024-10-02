package TP03_EJ03_V3;

/*
@author agush
 */
public class Main {

    public static void main(String[] args) {
        Comida comida = new Comida();
        Rueda rueda = new Rueda();
        Hamaca hamaca = new Hamaca();

        Thread lucio = new Thread(new Hamster("Lucio", comida, rueda, hamaca), "Lucio");
        Thread ana = new Thread(new Hamster("Ana", comida, rueda, hamaca), "Ana");
        Thread rockie = new Thread(new Hamster("rockie", comida, rueda, hamaca), "Rockie");

        lucio.start();
        ana.start();
        rockie.start();

        try {
            lucio.join();
            ana.join();
            rockie.join();
        } catch (InterruptedException e) {

        }
        System.out.println("Todos los bichos estan chochos!");
    }

}
