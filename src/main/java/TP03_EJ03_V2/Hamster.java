package TP03_EJ03_V2;
/*
@author agush
*/
public class Hamster implements Runnable {
    private String nombre;
    private Habitad habitad;
    
    public Hamster(Habitad habitad, String nombre){
        this.habitad = habitad;
        this.nombre = nombre;
    }
    
    @Override
    public void run(){
        habitad.hacerActividades();
    }

}
