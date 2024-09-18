package RANDOM3;

/*
@author agush
 */
class Dato {

    private int valor;

    public synchronized void incrementar() {
        valor = valor + 1;
    }

    int getValor() {
        return valor;
    }

}
