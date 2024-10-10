package TP04_EJ03_V2;
/*
@author agush
*/
public class Turno {
    private String nombre;
    
    public Turno(String nombre){
        this.nombre = nombre;
    }
    
    public String getTurno(){
        return nombre;
    }
    public void setTurno(String turno){
        nombre = turno;
    }
}
