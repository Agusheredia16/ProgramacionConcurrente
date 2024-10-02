package TP03_EJ02;

/*
@author agush
 */
public class Katarina {

    private int vida = 100;

    //Que le puedo hacer esta Katarina?
    //Dañar
    public synchronized void curar() {
        vida = vida + 4;
        System.out.println(Thread.currentThread().getName() + " ha revitalizado " + 4 + " unidades de vida.");
        System.out.println("Vida actual: " + vida);
    }

    //Curar
    public synchronized void daniar() {
        vida = vida - 5;
        System.out.println(Thread.currentThread().getName() + " ha drenado " + 5 + " unidades de vida.");
        System.out.println("Vida actual: " + vida);
    }

    //Ver su vida
    public int getVida() {
        return vida;
    }

}
