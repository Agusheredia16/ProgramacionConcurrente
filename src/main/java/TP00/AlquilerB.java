package TP00;
/*
@author agush
*/
public class AlquilerB extends Alquiler{
    //Atributos
    private Barco barco;
    private int cantDias;
    
    //Constructores
    public AlquilerB(Cliente cliente, int numeroEstacionamiento, Barco barco, int cantDias){
        super(cliente, numeroEstacionamiento);
        this.barco = barco;
        this.cantDias = cantDias;
    }
    public AlquilerB(){
        super();
        this.barco = null;
        this.cantDias = 0;
    }
    
    //Getters y setters
    public Barco getBarco(){
        return barco;
    }
    public int getCantDias(){
        return cantDias;
    }
    public void setBarco(Barco barco){
        this.barco = barco;
    }
    public void setCantDias(int cantDias){
        this.cantDias = cantDias;
    }
    
    //Metodos

}
