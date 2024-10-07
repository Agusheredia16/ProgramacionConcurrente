package TP03_EJ05;


/*
@author agush
 */
public class Vehiculo {

    private int combustible;
    private int reserva;
    private Surtidor surtidor;

    public Vehiculo(int combustible, int reserva, Surtidor surtidor) {
        this.combustible = combustible;
        this.reserva = reserva;
        this.surtidor = surtidor;
    }

    public boolean conducir(int distancia) {
        boolean sePudo = false;
        if (combustible > reserva) {
            combustible = combustible - distancia;
            sePudo = true;
        }
        return sePudo;
    }

    public synchronized void cargarNafta() {
        int quieroCargar = 40 - combustible;
        if (surtidor.quedanReservas(quieroCargar)) {
            combustible = 40;            
        } else {
            System.out.println("No quedan reservas (" + surtidor.obtenerReservas() + ") para cargar al " + Thread.currentThread().getName() + "\n");
        }
    }
    
    public int getCombustible(){
        return combustible;
    }
    
    public Surtidor getSurtidor(){
        return surtidor;
    }
}
