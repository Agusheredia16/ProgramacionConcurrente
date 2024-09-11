package TP02_EJ07;

/*
@author agush
 */
public class CajeroThread extends Thread {

    private String nombre;
    private Cliente cliente;
    private long initialTime;
    // Constructor, y métodos de acceso

    CajeroThread(String nombre){
        this.nombre = nombre;
        this.cliente = null;
        this.initialTime = 0;
    }
    
    void esperarXSegundos(int producto) {
        try {
            Thread.sleep(1000 * producto);
        } catch (InterruptedException e) {
            System.out.println("Algo salio mal :c");
        }
    }
    
    void procesarCompra(Cliente cliente, long initialTime){
        this.cliente = cliente;
        this.initialTime = initialTime;
        start();
    }

    @Override
    public void run() {
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXSegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " del cliente " + this.cliente.getNombre() + "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }
        System.out.println("El cajero" + this.nombre + " HA TERMINADO DE PROCESAR" + this.cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }
}
