package TP03_EJ02_V2;

/*
@author agush
 */
// Clase Malzahar que representa el hilo que drena vida
class Malzahar implements Runnable {
    private Vida vida;

    // Constructor que recibe el recurso compartido
    public Malzahar(Vida vida) {
        this.vida = vida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) { // Drena vida 3 veces
            vida.drenarVida(5);
            try {
                Thread.sleep(1000); // Simula tiempo entre acciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
