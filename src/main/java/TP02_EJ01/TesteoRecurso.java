package TP02_EJ01;

/*
@author agush
 */
public class TesteoRecurso {

    public static void main(String[] args) {
        Clientea juan = new Clientea();
        juan.setName("Juan Lopez");
        Clientea ines = new Clientea();
        ines.setName("Ines Garcia");
        ines.start();
        juan.start();
        Recurso.uso();
    }

}
