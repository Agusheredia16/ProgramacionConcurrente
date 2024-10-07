package TP03_EJ05;

/*
@author agush
 */
public class Auto extends Vehiculo implements Runnable {

    private String patente;
    private String modelo;
    private String marca;
    private int km;

    public Auto(int combustible, int reserva, Surtidor surtidor, String patente, String modelo, String marca, int km) {
        super(combustible, reserva, surtidor);
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.km = km;
    }

    @Override
    public void run() {
        
        while(super.getSurtidor().getReservas()){
            if (!super.conducir(10)) {
                System.out.println("Al " + Thread.currentThread().getName() + " le toca cargar nafta, porque le queda " + super.getCombustible() + " de nafta");
                super.cargarNafta();
            } else {
                System.out.println("El " + Thread.currentThread().getName() + " tenia (" + (super.getCombustible() + 10) + "), conduce 10, ahora le quedan " + super.getCombustible() + " de nafta");
            }
        }
    }
}
