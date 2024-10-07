package TP03_EJ05;

/*
@author agush
*/
public class Main {

    public static void main(String[] args) {
        Surtidor surtidor = new Surtidor();
        Thread auto1 = new Thread(new Auto(40, 20, surtidor, "A", "1", "!", 0), "Auto 1");
        Thread auto2 = new Thread(new Auto(40, 20, surtidor, "B", "2", "#", 0), "Auto 2");
        //Thread auto3 = new Thread(new Auto(100, 50, surtidor, "C", "3", "$", 0), "Auto 3");


        auto1.start();
        
        auto2.start();
        //auto3.start();
    }

}

//Me aburri, lo quise corregir y perfeccionarlo y termine haciendo una gasolineria que tiene un solo surtidor.
//Llegue a odiar synchronized, siento que es una herramienta que solo usare en casos simples.
//Para casos mas complejos prefiero usar semaforos, ya que me dan la opcion de controlar bien quien que hilo
//tiene prioridad, en cambio con synchronized las llaves de las clases son las que definen el comportamiento
//y no siento que tengo mucho control cuando el problema a resolver es muy complejo