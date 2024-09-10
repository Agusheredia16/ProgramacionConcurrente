package RANDOM;
/*
@author agush
*/
public class PruebaRunnable {
    public static void main(String[] args) {
        PingPongR o1 = new PingPongR("ping", 300);
        PingPongR o2 = new PingPongR("pong", 100);
        
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        
        t1.start();
        t2.start();
    }

}
