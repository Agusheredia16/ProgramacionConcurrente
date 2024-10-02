package TP03_EJ02;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
@author agush
*/
public class Malzahar implements Runnable {
    private Katarina katarina;
    
    public Malzahar(Katarina katarina){
        this.katarina = katarina;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 30; i++) {
            katarina.daniar();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Malzahar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


