package TP02_EJ07;

/*
@author agush
 */
public class CajeroRunnable implements Runnable {

    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public CajeroRunnable(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    private void esperarXSegundos(int producto) {
        try {
            Thread.sleep(1000 * producto);
        } catch (InterruptedException e) {
            System.out.println("Algo salió mal :c");
        }
    }

    @Override
    public void run() {
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXSegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " del cliente "
                    + this.cliente.getNombre() + " -> Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }

        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }
}
