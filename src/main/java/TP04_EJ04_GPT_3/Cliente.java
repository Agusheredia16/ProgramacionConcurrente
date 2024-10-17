package TP04_EJ04_GPT_3;
/*
@author agush
*/
// Clase Cliente que simula un cliente que quiere imprimir
class Cliente implements Runnable {
    private final String nombreCliente;
    private final GestorImpresoras gestor;
    private final int tiempoImpresion;

    public Cliente(String nombreCliente, GestorImpresoras gestor, int tiempoImpresion) {
        this.nombreCliente = nombreCliente;
        this.gestor = gestor;
        this.tiempoImpresion = tiempoImpresion;
    }

    @Override
    public void run() {
        System.out.println(nombreCliente + " ha llegado al centro de copiado.");
        gestor.imprimir(nombreCliente, tiempoImpresion, false);
    }
}