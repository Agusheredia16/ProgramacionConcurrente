package TP03_EJ03_V3;

/*
@author agush
*/
public class Hamaca {
    
    public synchronized int dormir(){
        System.out.println(Thread.currentThread().getName() + " ha empezado a dormir");
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
        }
        System.out.println(Thread.currentThread().getName() + " ha despertado");
        return 1;
    }
}
