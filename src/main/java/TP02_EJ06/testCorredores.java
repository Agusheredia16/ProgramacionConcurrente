package TP02_EJ06;

import java.util.Scanner;

/*
@author agush
 */
public class testCorredores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread[] corredores = new Thread[3];
        for (int i = 0; i < corredores.length; i++) {
            System.out.println("Ingrese nombre del corredor: " + i);
            corredores[i] = new Thread(new Corredor(sc.nextLine())); 
        }
        corredores[0].start();
        corredores[1].start();
        corredores[2].start();
    }

}
