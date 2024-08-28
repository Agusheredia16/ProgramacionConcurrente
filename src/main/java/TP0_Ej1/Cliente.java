package TP0_Ej1;
/*
@author agush
*/
public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    
    //Constructores
    public Cliente(String nombre, String apellido, Fecha fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Cliente(){
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = new Fecha();
    }
    
    //Getters y setters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public Fecha getFecha(){
        return fechaNacimiento;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNacimiento(Fecha fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodos
    
}
