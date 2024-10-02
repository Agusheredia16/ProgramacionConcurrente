package TP03_EJ02_V2;

/*
@author agush
 */
// Clase Soraka que representa el hilo que revitaliza vida
class Soraka implements Runnable {

    private Vida vida;

    // Constructor que recibe el recurso compartido
    public Soraka(Vida vida) {
        this.vida = vida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) { // Revitaliza vida 3 veces
            vida.revitalizarVida(4);
            try {
                Thread.sleep(1000); // Simula tiempo entre acciones
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
