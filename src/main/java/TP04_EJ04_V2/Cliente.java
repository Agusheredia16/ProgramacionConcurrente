package TP04_EJ04_V2;
/*
@author agush
*/
public class Cliente implements Runnable {
    private String nombre;
    private GestorImpresoras gestor;
    private int tiempoImpresion;
    
    public Cliente(String nombre, GestorImpresoras gestor, int tiempoImpresion){
        this.nombre = nombre;
        this.gestor = gestor;
        this.tiempoImpresion = tiempoImpresion;
    }
    
    @Override
    public void run(){
        System.out.println("El cliente " + nombre + " entra a la imprenta");
        gestor.imprimir(nombre, tiempoImpresion, false);
    }
    

}
