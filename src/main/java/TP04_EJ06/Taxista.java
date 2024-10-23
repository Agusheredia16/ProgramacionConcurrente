package TP04_EJ06;
/*
@author agush
*/
public class Taxista implements Runnable{
    private String nombreT;
    private int nroTaxi;
    private Taxi taxi;
    
    public Taxista(String nombreT, Taxi taxi, int nroTaxi){
        this.nombreT = nombreT;
        this.taxi = taxi;
        this.nroTaxi = nroTaxi;
    }
    
    @Override
    public void run(){
        taxi.conducir(nroTaxi);
    }

}
