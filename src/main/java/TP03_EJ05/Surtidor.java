package TP03_EJ05;

/*
@author agush
 */
public class Surtidor {

    private int reservas = 80;

    public boolean quedanReservas(int pedido) {
        boolean sePuede = false;
        if (reservas - pedido >= 0) {
            System.out.println("Quedan " + obtenerReservas() + " reservas para cargar al " + Thread.currentThread().getName());
            System.out.println("Se procede a cargar nafta al " + Thread.currentThread().getName() + ". Por favor espere... \n");
            cargarNafta(pedido);
            sePuede = true;
        }
        return sePuede;
    }

    public synchronized void cargarNafta(int pedido) {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
        }
        synchronized (this) {
            reservas = reservas - pedido;
            System.out.println("Se ha cargado " + pedido + " de nafta al " + Thread.currentThread().getName() + " NICENICENICENICENICE \n" + "Se lleno (" + pedido + ") el tanque del " + Thread.currentThread().getName() + ", quedan " + obtenerReservas() + " de reservas en el surtidor");
        }
    }

    public synchronized boolean getReservas() {
        boolean quedanReservas = true;
        if (reservas <= 0) {
            quedanReservas = false;
        }
        return quedanReservas;
    }

    public synchronized int obtenerReservas() {
        return reservas;
    }
}
