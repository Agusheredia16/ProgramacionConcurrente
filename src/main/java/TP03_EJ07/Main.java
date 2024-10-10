package TP03_EJ07;

/*
@author agush
*/
public class Main { //Solo imprime ABBCCC una vez.

    public static void main(String[] args) {
        
        Turno turno = new Turno("A");

        Thread a = new Thread(new Letra("A", 1, turno), "A");
        Thread b = new Thread(new Letra("B", 2, turno), "B");
        Thread c = new Thread(new Letra("C", 3, turno), "C");
        
        a.start();
        b.start();
        c.start();
        
    }

}
