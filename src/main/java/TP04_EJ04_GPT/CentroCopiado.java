package TP04_EJ04_GPT;

/*
@author agush
 */
public class CentroCopiado {

    public static void main(String[] args) {
        // Crear un gestor con 3 impresoras disponibles
        GestorImpresoras gestor = new GestorImpresoras(3);

        // Crear varios clientes que simulan llegar al centro de copiado
        Thread cliente1 = new Thread(new Cliente("Cliente 1", gestor, 2000));
        Thread cliente2 = new Thread(new Cliente("Cliente 2", gestor, 3000));
        Thread cliente3 = new Thread(new Cliente("Cliente 3", gestor, 1000));
        Thread cliente4 = new Thread(new Cliente("Cliente 4", gestor, 1500));
        Thread cliente5 = new Thread(new Cliente("Cliente 5", gestor, 2500));

        // Iniciar los hilos de los clientes
        cliente1.start();
        cliente2.start();
        cliente3.start();
        cliente4.start();
        cliente5.start();
    }
}
