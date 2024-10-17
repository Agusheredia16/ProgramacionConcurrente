package TP04_EJ05;

import TP04_EJ04_V2.*;

/*
@author agush
 */
public class Main {

    public static void main(String[] args) {
        GestorImpresoras gestor = new GestorImpresoras(3,2);

        Thread hilo1 = new Thread(new Cliente("Cliente1", gestor, "A", 2000));
        Thread hilo2 = new Thread(new Cliente("Cliente2", gestor, "A", 5000));
        Thread hilo3 = new Thread(new Cliente("Cliente3", gestor, "A", 3000));
        Thread hilo4 = new Thread(new Cliente("Cliente4", gestor, "A", 4000));
        Thread hilo5 = new Thread(new Cliente("Cliente5", gestor, "X", 2000));
        Thread hilo6 = new Thread(new Cliente("Cliente6", gestor, "X", 2000));
        Thread hilo7 = new Thread(new Cliente("Cliente7", gestor, "B", 2000));
        Thread hilo8 = new Thread(new Cliente("Cliente8", gestor, "B", 2000));
        Thread hilo9 = new Thread(new Cliente("Cliente9", gestor, "B", 2000));
        Thread hilo10 = new Thread(new Cliente("Cliente10", gestor, "B", 2000));
        Thread hilo11 = new Thread(new Cliente("Cliente11", gestor, "B", 2000));
        Thread hilo12 = new Thread(new Cliente("Cliente12", gestor, "B", 2000));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
        hilo7.start();
        hilo8.start();
        hilo9.start();
        hilo10.start();
        hilo11.start();
        hilo12.start();
    }

}
