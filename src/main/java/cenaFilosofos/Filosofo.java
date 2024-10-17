package cenaFilosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ulise
 */
public class Filosofo implements Runnable {

    private String nombre;
    private int id;
    private Cena cena;

    public Filosofo(String nom, int iddd, Cena ce) {
        nombre = nom;
        id = iddd;
        cena = ce;
    }

//    public void run() {
//        while (true) {
//            cena.buscarTenedor(nombre);
//            this.comiendo();
//            cena.soltarTenedor(nombre);
//            this.pensando();
//        }
//    }

    public void pensando() {
        try {
            System.out.println(nombre + " estoy pensando");
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void comiendo() {
        try {
            System.out.println(nombre + " estoy comiendo");
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void run() {
        int i=0;
        while (i<5) {
            if(cena.agarrarTenedor(nombre)){
                this.comiendo();
                cena.soltarTenedor(nombre);
                this.pensando();
            }else{
                this.pensando();
            }
            i++;
        }
    }
}