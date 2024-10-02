package TP03_EJ03;

/*
@author agush
 */
public class Hamster implements Runnable {

    private final Habitad habitad;
    private final String nombre;
    private int actividades = 0;
    private boolean comio = false;
    private boolean corrio = false;
    private boolean descanso = false;

    public Hamster(Habitad habitad, String nombre) {
        this.habitad = habitad;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (actividades < 3) {
            if (comio == false) {
                comio = true;
                habitad.comida();
                actividades++;
                System.out.println(" --- " + nombre + " ya comió");
            }
            if (corrio == false) {
                corrio = true;
                habitad.ejercicio();
                actividades++;
                System.out.println(" --- " + nombre + " ya corrió");
            }
            if (descanso == false) {
                descanso = true;
                habitad.hamaca();
                actividades++;
                System.out.println(" --- " + nombre + " ya descansó");
            }
        }
        System.out.println(nombre + " ESTA CHOCHO");

    }
}
