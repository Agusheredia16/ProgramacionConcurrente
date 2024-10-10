package TP03_EJ07;

/*
@author agush
 */
public class Turno {

    private String nombre;

    public Turno(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void cambiarTurno(){
        switch (nombre) {
            case "A" -> nombre = "B";
            case "B" -> nombre = "C";
            case "C" -> nombre = "A";
            default -> {
            }
        }
    }
}
