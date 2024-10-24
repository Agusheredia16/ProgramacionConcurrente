package TP04_EJ07;

/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Comedor comedor = new Comedor(new String[]{"Carne", "Pollo", "Pescado", "Albondigas", "Verduras Hervidas"});
        
        Empleado agus = new Empleado("Agustin", comedor);
        Empleado gonza = new Empleado("Gonzalo", comedor);
        Empleado jere = new Empleado("Jeremias", comedor);

        Mozo maxi = new Mozo(comedor);
        
        Thread hilo1 = new Thread(agus, "Agustin");
        Thread hilo2 = new Thread(gonza, "Gonzalo");
        Thread hilo3 = new Thread(jere, "Jeremias");
        Thread hilo4 = new Thread(maxi, "Maximiliano");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }

}
