package TP02_EJ03;  //SIEMPRE CHEQUEAR ESTAS 2 CLASES PARA ENTENDER LA DIFERENCIA
/*                    ENTRE THREAD Y RUNNABLE
@author agush
 */
public class ThreadEjemplo extends Thread {

    public ThreadEjemplo(String str) {
        super(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
        }
        System.out.println("Termina thread " + getName());
    }

    public static void main(String[] args) {
        new ThreadEjemplo("Maria Jose").start();
        new ThreadEjemplo("Jose Maria").start();
        System.out.println("Termina thread main");
    }
}
