package TP04_EJ04_GPT_2;

/*
@author agush
*/
public class Main {
    //Lo resolvi usando semaforos genericos, en la V3 lo intento con semaforos binarios
    public static void main(String[] args) {
        GestorImpresoras gestor = new GestorImpresoras(3);
        
        Thread cliente1 = new Thread(new Cliente("Agus", gestor, 2000));
        Thread cliente2 = new Thread(new Cliente("Gonza", gestor, 10000));
        Thread cliente3 = new Thread(new Cliente("Jere", gestor, 3000));
        Thread cliente4 = new Thread(new Cliente("Joaquin", gestor, 5000));
        Thread cliente5 = new Thread(new Cliente("Lala", gestor, 2000));
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
    }

}
