package TP02_EJ02;

/*
@author agush
 */
public class TesteoHilos {

    public static void main(String[] args) {
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        
        try{
        miHilo.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println("En el main");
    }

}
