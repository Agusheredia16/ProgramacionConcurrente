package TP04_EJ04;
/*
@author agush
*/
public class Impresora {
    private String nroMaquina;
    private boolean ocupada;
    
    public Impresora(String nroMaquina){
        this.nroMaquina = nroMaquina;
        this.ocupada = false;
    }
    
    public boolean estaOcupada(){
        return ocupada;
    }
    
    public String getNroMaquina(){
        return nroMaquina;
    }
    
    public void ocupar(){
        ocupada = true;
    }
    
}
