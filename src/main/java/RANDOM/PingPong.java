package RANDOM;

/*
@author agush
*/
public class PingPong extends Thread{
    private String cadena;  //Lo que va a escribir
    private int delay;      //Tiempo entre escritura
    
    public PingPong(String cartel, int cantMs){
        cadena = cartel;
        delay = cantMs;
    }
    public void run(){
        for (int i = 1; i < delay * 10; i++) {
            System.out.println(cadena + " ");
            try{
                Thread.sleep(delay);
            }catch(InterruptedException e){
                //a
            }
        }
    }   //fin run()
    
    public static void main(String[] args) {
        PingPong t1 = new PingPong("PING111", 1000);
        PingPong t2 = new PingPong("PONG", 1000);
        
        //Activacion
        t1.start();
        t2.start();
        
        //Espera unos segundos
        try{
            Thread.sleep(5000);
            System.out.println("soy el try");
        }catch(InterruptedException e){
            //aaa
        }
        //fin
    }
    
}   //fin PingPong
