package TP04_EJ04_V2;

/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        GestorImpresoras gestor = new GestorImpresoras(3);
        
        Thread hilo1 = new Thread(new Cliente("Agus", gestor, 2000));
        Thread hilo2 = new Thread(new Cliente("Gonza", gestor, 5000));
        Thread hilo3 = new Thread(new Cliente("Jere", gestor, 3000));
        Thread hilo4 = new Thread(new Cliente("Joako", gestor, 4000));
        Thread hilo5 = new Thread(new Cliente("Lala", gestor, 2000));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }

}
