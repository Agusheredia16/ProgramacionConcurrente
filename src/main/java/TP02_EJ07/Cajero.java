package TP02_EJ07;

/*
@author agush
 */
public class Cajero {

    private String nombre;
    // Agregar Constructor, y métodos de acceso

    Cajero(String nombre) {
        this.nombre = nombre;
    }

    void esperarXSegundos(int producto) {
        try {
            Thread.sleep(1000 * producto);
        } catch (InterruptedException e) {
            System.out.println("Algo salio mal :c");
        }
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXSegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + "->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        }
        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    }
}
