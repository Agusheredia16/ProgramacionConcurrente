package TP02_EJ07;

/*
@author agush
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;
    // Constructor y métodos de acceso

    Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }
    
    int[] getCarroCompra(){
        return carroCompra;
    }
    
    String getNombre(){
        return nombre;
    }
}
