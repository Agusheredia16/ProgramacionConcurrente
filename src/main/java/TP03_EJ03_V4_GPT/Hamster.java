package TP03_EJ03_V4_GPT;

/*
@author agush
 */
class Hamster implements Runnable {

    private String nombre;
    private Jaula jaula;

    public Hamster(String nombre, Jaula jaula) {
        this.nombre = nombre;
        this.jaula = jaula;
    }

    @Override
    public void run() {
        try {
            jaula.comer(nombre);
            jaula.correr(nombre);
            jaula.descansar(nombre);
        } catch (InterruptedException e) {
            System.out.println(nombre + " fue interrumpido.");
        }
    }
}
