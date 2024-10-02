package RANDOM4;

/*
@author agush
 */
public class ProcesoI implements Runnable {

    private Datos dato;

    public ProcesoI(Datos dato) {
        this.dato = dato;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10000; i++) {
            dato.incrementar();
        }
    }
}
