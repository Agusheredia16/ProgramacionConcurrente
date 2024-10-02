package TP03_EJ03_V3;

/*
@author agush
 */
public class Hamster implements Runnable{

    private final String nombre;
    private final Comida comida;
    private final Rueda rueda;
    private final Hamaca hamaca;
    private boolean haComido = false;
    private boolean haCorrido = false;
    private boolean haDormido = false;
    private int actividades = 0;
    
    public Hamster(String nombre, Comida comida, Rueda rueda, Hamaca hamaca) {
        this.nombre = nombre;
        this.comida = comida;
        this.rueda = rueda;
        this.hamaca = hamaca;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public void run(){
        while(actividades < 3){
            if(!haComido){
                actividades = actividades + comida.comer();
                haComido = true;
            }
            if(!haCorrido){
                actividades = actividades + rueda.correr();
                haCorrido = true;
            }
            if(!haDormido){
                actividades = actividades + hamaca.dormir();
                haDormido = true;
            }
        }
    }
}
