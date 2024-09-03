package TP00;
/*
@author agush
*/
public class Alquiler {
    //Atributos
    private Cliente cliente;
    private int numeroEstacionamiento;
    
    //Constructores
    public Alquiler(Cliente cliente, int numeroEstacionamiento){
        this.cliente = cliente;
        this.numeroEstacionamiento = numeroEstacionamiento;
    }
    public Alquiler(){
        this.cliente = null;
        this.numeroEstacionamiento = 0;
    }
    
    //Getters y setters
    public Cliente getCliente(){
        return cliente;
    }
    public int getNumeroEstacionamiento(){
        return numeroEstacionamiento;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setNumeroEstacionamiento(int numeroEstacionamiento){
        this.numeroEstacionamiento = numeroEstacionamiento;
    }
    
    //Metodos
}
