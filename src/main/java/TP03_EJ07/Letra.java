package TP03_EJ07;

/*
@author agush
 */
public class Letra implements Runnable {

    private String nombre;
    private int repeticiones;
    private Turno turno;
    private int terminamos = 0;

    public Letra(String nombre, int repeticiones, Turno turno) {
        this.nombre = nombre;
        this.repeticiones = repeticiones;
        this.turno = turno;
    }

    @Override
    public void run() {
        while (terminamos < 3) {
            if (turno.getNombre().equals(nombre)) {
                for (int i = 0; i < repeticiones; i++) {
                    System.out.print(nombre);
                }
                //terminamos--;
                turno.cambiarTurno();
            }
        }
    }

}
