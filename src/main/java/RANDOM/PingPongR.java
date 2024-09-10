package RANDOM;

/*
@author agush
*/
public class PingPongR implements Runnable{
    private String cadena;
    private int delay;
    
    public PingPongR(String cartel, int cantMs){
        cadena = cartel;
        delay = cantMs;
    }

    @Override
    public void run(){
        for (int i = 0; i < delay * 10; i++) {
            System.out.println(cadena + "");
            try{
                Thread.sleep(delay);
            }catch(InterruptedException e){
                //a
            }
        }
    }


}
