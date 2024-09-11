package TP02_EJ01;

/*
@author agush
 */
public class Recurso {

    static void uso() {
        Thread t = Thread.currentThread();
        System.out.println("en Recurso: Soy" + t.getName());
    }
}
