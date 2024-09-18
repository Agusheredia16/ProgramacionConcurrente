package RANDOM3;

/*
@author agush
 */
class RunnableCdor implements Runnable {

    Dato contador;

    public RunnableCdor(Dato contador) {

        this.contador = contador;

    }

    @Override
    public void run() {

        for (int x = 0; x < 10000; ++x) {
            contador.incrementar();
        }

    }

}
