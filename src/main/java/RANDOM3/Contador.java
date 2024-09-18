package RANDOM3;

/*
@author agush
 */
public class Contador {

    public static void main(String[] args) {

        final Dato metodosDelContador = new Dato();

        RunnableCdor runDelContador = new RunnableCdor(metodosDelContador);

        Thread h1 = new Thread(runDelContador);
        Thread h2 = new Thread(runDelContador);
        h1.start();
        h2.start();
        
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {

        }
        
        System.out.println("en main-" + metodosDelContador.getValor());

    }

}
