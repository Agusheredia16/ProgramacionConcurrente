package TP02_EJ07;

/*
@author agush
 */
public class MainThread {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[]{1, 3, 5, 1, 1});
        
        CajeroThread cajero1 = new CajeroThread("Agush");
        CajeroThread cajero2 = new CajeroThread("Gonza");
        
        long initialTime = System.currentTimeMillis();
        
        cajero1.procesarCompra(cliente1, initialTime);
        cajero2.procesarCompra(cliente2, initialTime);
    }
}
