package TP04_EJ07;
/*
@author agush
*/
public class Empleado implements Runnable{
    private String nombre;
    private Comedor comedor;
    
    public Empleado(String nombre, Comedor comedor){
        this.nombre = nombre;
        this.comedor = comedor;
    }
    @Override
    public void run(){
        comedor.comer(this);
    }
    
    public String getNombre(){
        return nombre;
    }

}
