package TP04_EJ05;

/*
@author agush
*/
public class Cliente implements Runnable {
    private String nombre;
    private GestorImpresoras gestor;
    private String tipo;
    private int tiempoImpresion;
    
    public Cliente(String nombre, GestorImpresoras gestor, String tipo, int tiempoImpresion){
        this.nombre = nombre;
        this.gestor = gestor;
        this.tipo = tipo;
        this.tiempoImpresion = tiempoImpresion;
    }
    
    @Override
    public void run(){
        System.out.println("El cliente " + nombre + " entra a la imprenta");
        gestor.imprimir(nombre, tipo, tiempoImpresion, false);
    }
    

}
