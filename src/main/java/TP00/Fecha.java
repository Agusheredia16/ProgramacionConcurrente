package TP00;
/*
@author agush
*/
public class Fecha {
    //Atributos
    private int dia;
    private int mes;
    private int anio;
    
    //Constructores
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public Fecha(){
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }
    
    //Getters y setters
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    
    //Metodos
    public void restarFechas(Fecha fecha2){
        this.dia = (this.dia - fecha2.getDia());
    }
}
