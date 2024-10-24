package TP04_EJ07;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class Comedor {

    private String[] menu;
    private Empleado comensal;
    private Semaphore hayClientela = new Semaphore(0);
    private Semaphore meToca = new Semaphore(1);
    private Semaphore orden = new Semaphore(0);

    public Comedor(String[] menu) {
        this.menu = menu;
    }

    public void comer(Empleado comensal) {
        try {
            meToca.acquire();   //Da inicio a todo el proceso
            this.comensal = comensal;
            System.out.println(comensal.getNombre() + " quiere comer");
            int randomNumber = (int) (Math.random() * 4) + 1;
            System.out.println(comensal.getNombre() + " ha elegido " + menu[randomNumber]);
            hayClientela.release();     //Da la orden al mozo para empezar a atender
            orden.acquire(); //Esto para que el hilo espere a que el mozo termine de preparar su comida  
            System.out.println(comensal.getNombre() + ": Itakimasu!");
            Thread.sleep(2000);
            System.out.println(comensal.getNombre() + ": Gracias por la comida, abrazo y chau");
            meToca.release();
        } catch (InterruptedException e) {
        }
    }

    public void atender() {
        for (int i = 0; i < 3; i++) {

            try {
                hayClientela.acquire();
                System.out.println("Empezare a preparar la comida para el empleado " + comensal.getNombre());
                Thread.sleep(4000);
                System.out.println("Termine de preparar la comida para el empleado " + comensal.getNombre() + ". Procedere a servile");
                orden.release();    //Permite que el comensal empiece a comer
            } catch (InterruptedException e) {
            }
        }
    }

    public Semaphore getClientela() {
        return hayClientela;
    }

    //public Empleado getEmpleado(){
    //    return comensal;
    //}
}
