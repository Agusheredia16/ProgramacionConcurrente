package TP03_EJ02_V2;

/*
@author agush
 */
class Vida {
    private int vida = 100;

    // Método para drenar vida
    public synchronized void drenarVida(int cantidad) {
        vida = vida - cantidad;
        System.out.println(Thread.currentThread().getName() + " ha drenado " + cantidad + " unidades de vida.");
        System.out.println("Vida actual: " + vida);
    }

    // Método para revitalizar vida
    public synchronized void revitalizarVida(int cantidad) {
        vida = vida + cantidad;
        System.out.println(Thread.currentThread().getName() + " ha revitalizado " + cantidad + " unidades de vida.");
        System.out.println("Vida actual: " + vida);
    }

    // Método para obtener la vida actual
    public int getVida() {
        return vida;
    }
}
