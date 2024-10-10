package RANDOM5;

/*
@author agush
 */
public class EjemploSemaforo {

    public static void main(String[] args) {
        RecursoCompartido recurso = new RecursoCompartido();
        Thread hilo1 = new Thread(new HiloUsuario(recurso), "Hilo 1");
        Thread hilo2 = new Thread(new HiloUsuario(recurso), "Hilo 2");

        hilo2.start();
        hilo1.start();
        
    }
}
