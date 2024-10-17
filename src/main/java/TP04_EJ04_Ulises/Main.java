package TP04_EJ04_Ulises;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
@author agush
 */
public class Main {

    public static void main(String[] args) {
        // 
        Impresora impresoraA = new Impresora('A');
        Impresora impresoraB = new Impresora('B');
        Impresora[] impresoras = new Impresora[2];
        impresoras[0] = impresoraA;
        impresoras[1] = impresoraB;
        GestorImpresoras gestor = new GestorImpresoras(impresoras);
        Cliente[] clientes = new Cliente[9];
        Thread hilos[] = new Thread[clientes.length];

        for (int i = 0; i < clientes.length; i++) {
            char tipo = (i % 2 == 0) ? 'A' : 'B'; // Alterna entre 'A' y 'B'
            clientes[i] = new Cliente(("Hilo" + (i + 1)), tipo, gestor);
        }

        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(clientes[i]);
            hilos[i].start();
        }

        for (int i = 0; i < hilos.length; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
