package TP03_EJ04;

/*
@author agush
 */
public class Visitante implements Runnable {

    private Area area;

    public Visitante(Area area) {
        this.area = area;
    }

    @Override
    public void run() {
        int nroRandom = (int)(Math.random()*3)+1;
        System.out.println(Thread.currentThread().getName() + " quiere reservar el espacio " + nroRandom);
        if (area.reservarEspacio(nroRandom)) {
            System.out.println(Thread.currentThread().getName() + " ha reservado el espacio " + nroRandom);
        } else{
            System.out.println(Thread.currentThread().getName() + " no pudo reservar el espacio " + nroRandom);
        }
    }
}
