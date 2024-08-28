package TP0_Ej1;
/*
@author agush
*/
public class Barco extends Vehiculo{
    //Atributos
    private double manga;
    private double eslora;
    
    //Constructores
    public Barco(double manga, double eslora){
        this.manga = manga;
        this.eslora = eslora;
    }
    public Barco(){
        this.manga = 0;
        this.eslora = 0;
    }
    
    //Getters y setters
    public double getManga(){
        return manga;
    }
    public double getEslora(){
        return eslora;
    }
    public void setManga(double manga){
        this.manga = manga;
    }
    public void setEslora(double eslora){
        this.eslora = eslora;
    }
    
    //Metodos
}
