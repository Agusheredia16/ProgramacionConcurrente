package cenaFilosofos;

// @author ulise
public class CenaFilosofosTest {

    public static void main(String[] args) {
        Cena cena = new Cena();
        Filosofo[] filo = new Filosofo[5];
        Thread[] filosofos = new Thread[filo.length];
        for (int i = 0; i < filo.length; i++) {
            filo[i] = new Filosofo("filoso" + (i + 1), i + 1, cena);
            filosofos[i] = new Thread(filo[i]);
            filosofos[i].start();
        }
    }

}