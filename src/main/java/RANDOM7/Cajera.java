package RANDOM7;

/*
@author agush
 */
public class Cajera {

    public void atenderCliente() {
        System.out.println("La cajera esta atendiendo al cliente " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //F
        }
    }
}
