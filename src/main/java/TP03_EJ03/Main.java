package TP03_EJ03;

/*
@author agush
 */
public class Main {

    public static void main(String[] args) {
        Habitad jaula = new Habitad();

        Hamster lucio = new Hamster(jaula, "Lucio");
        Hamster ana = new Hamster(jaula, "Ana");
        Hamster rockie = new Hamster(jaula, "Rockie");

        Thread lucioH = new Thread(lucio);
        Thread anaH = new Thread(ana);
        Thread rockieH = new Thread(rockie);

        lucioH.start();
        anaH.start();
        rockieH.start();

        try {
            lucioH.join();
            anaH.join();
            rockieH.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Los 3 hamsters terminaron sus actividades");
    }

}
