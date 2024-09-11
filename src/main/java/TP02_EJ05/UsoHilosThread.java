package TP02_EJ05;

/*
@author agush
 */
class UsoHilosThread {
    
    public static void main(String[] args) {
        System.out.println("Hilo MAIN iniciado");
        Thread miHiloT = new MiHiloThread("#1");
        miHiloT.start();
        
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
        }
        System.out.println("");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("Hilo MAIN interrumpido");
        }
        System.out.println("Hilo MAIN terminado");
    }
    
}
