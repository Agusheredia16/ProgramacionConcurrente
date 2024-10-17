package TP04_EJ05;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class GestorImpresoras {

    private Semaphore[] impresorasA;
    private Semaphore[] impresorasB;

    public GestorImpresoras(int cantidadImpresorasA, int cantidadImpresorasB) {
        impresorasA = new Semaphore[cantidadImpresorasA];
        impresorasB = new Semaphore[cantidadImpresorasB];

        for (int i = 0; i < cantidadImpresorasA; i++) {
            impresorasA[i] = new Semaphore(1);
        }

        for (int i = 0; i < cantidadImpresorasB; i++) {
            impresorasB[i] = new Semaphore(1);
        }
    }

    public void imprimir(String nombre, String tipo, int tiempoImpresion, boolean termino) {
        try {
            switch (tipo) {
                case "A" -> {
                    int impresoraADisponible = -1;
                    while (!termino) {
                        //Aca comprobamos si hay impresora disponible
                        for (int i = 0; i < impresorasA.length && impresoraADisponible == -1; i++) {
                            if (impresorasA[i].tryAcquire()) {
                                System.out.println("El cliente " + nombre + " va a usar la impresoraA nro: " + (i + 1));
                                impresoraADisponible = i;
                            }
                        }
                        //Si encontro impresora disponible, imprime
                        if (impresoraADisponible != -1) {
                            Thread.sleep(tiempoImpresion);
                            System.out.println("El cliente " + nombre + " ha terminado");
                            impresorasA[impresoraADisponible].release();
                            termino = true;
                        } else {    //Si no encontro impresora disponible, espera
                            //Thread.sleep(2000);
                            //System.out.println(nombre + " espera pacientemente");
                            //Thread.sleep(1000);
                        }
                    }
                }
                case "B" -> {
                    int impresoraBDisponible = -1;
                    while (!termino) {
                        //Aca comprobamos si hay impresora disponible
                        for (int i = 0; i < impresorasB.length && impresoraBDisponible == -1; i++) {
                            if (impresorasB[i].tryAcquire()) {
                                System.out.println("El cliente " + nombre + " va a usar la impresoraB nro: " + (i + 1));
                                impresoraBDisponible = i;
                            }
                        }
                        //Si encontro impresora disponible, imprime
                        if (impresoraBDisponible != -1) {
                            Thread.sleep(tiempoImpresion);
                            System.out.println("El cliente " + nombre + " ha terminado");
                            impresorasB[impresoraBDisponible].release();
                            termino = true;
                        } else {    //Si no encontro impresora disponible, espera
                            //Thread.sleep(500);
                            //System.out.println(nombre + " espera pacientemente");
                            //Thread.sleep(1000);
                        }
                    }

                }
                case "X" -> {
                    int impresoraADisponible = -1;
                    int impresoraBDisponible = -1;
                    while (!termino) {
                        //Aca comprobamos si hay impresoraA o impresoraB disponible
                        for (int i = 0, j = 0; (i < impresorasA.length && impresoraADisponible == -1) && (j < impresorasB.length && impresoraBDisponible == -1); i++, j++) {
                            if (i < impresorasA.length && impresorasA[i].tryAcquire()) {
                                System.out.println("El cliente " + nombre + " va a usar la impresoraA nro: " + (i + 1));
                                impresoraADisponible = i;
                            } else if (j < impresorasB.length && impresorasB[j].tryAcquire()) {
                                System.out.println("El cliente " + nombre + " va a usar la impresoraB nro: " + (i + 1));
                                impresoraBDisponible = i;
                            }
                            if (impresoraADisponible != -1) {
                                Thread.sleep(tiempoImpresion);
                                System.out.println("El cliente " + nombre + " ha terminado");
                                impresorasA[impresoraADisponible].release();
                                termino = true;
                            } else if (impresoraBDisponible != -1) {
                                Thread.sleep(tiempoImpresion);
                                System.out.println("El cliente " + nombre + " ha terminado");
                                impresorasB[impresoraBDisponible].release();
                                termino = true;
                            }
                        }
                    }
                }
                default -> {
                }
            }

        } catch (InterruptedException e) {
            //f
        }
    }

}
