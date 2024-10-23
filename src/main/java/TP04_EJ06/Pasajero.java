package TP04_EJ06;
/*
@author agush
*/
public class Pasajero implements Runnable {
    private String nombreP;
    private int tiempoDestino;
    private Taxi[] taxis;
    
    public Pasajero(String nombreP, int tiempoDestino, Taxi[] taxis){
        this.nombreP = nombreP;
        this.tiempoDestino = tiempoDestino;
        this.taxis = taxis;
    }
    
    
    
    @Override
    public void run(){
        int i = 0;
        while(!taxis[i].getDisponible()){
            i++;
        }
        taxis[i].tomarTaxi(nombreP, tiempoDestino, i);
    }

}
