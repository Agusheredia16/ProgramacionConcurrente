package TP0_Ej1;
/*
@author agush
*/
public class Vehiculo {
    //Atributos
    private String matricula;
    private int anioFab;
    
    //Constructores
    public Vehiculo(String matricula, int anioFab){
        this.matricula = matricula;
        this.anioFab = anioFab;
    }
    public Vehiculo(){
        this.matricula = "";
        this.anioFab = 0;
    }
    
    //Getters y setters
    public String getMatricula(){
        return matricula;
    }
    public int getAnioFab(){
        return anioFab;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setAnioFab(int anioFab){
        this.anioFab = anioFab;
    }
    
    //Metodos
}
