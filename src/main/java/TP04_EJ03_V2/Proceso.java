package TP04_EJ03_V2;

import java.util.concurrent.Semaphore;

/*
@author agush
 */
public class Proceso implements Runnable {

    private Turno turno;
    private Semaphore semaforo;

    public Proceso(Turno turno, Semaphore semaforo) {
        this.turno = turno;
        this.semaforo = semaforo;
    }

    @Override
    public void run() {
        while (true) {

            try {
                //System.out.println("Hilo: " + Thread.currentThread().getName() + ". Turno: " + turno.getTurno() + ". VoF: " + turno.getTurno().equals(Thread.currentThread().getName()));
                if (turno.getTurno().equals(Thread.currentThread().getName())) {
                    semaforo.acquire();
                    Thread.sleep(1);
                    System.out.println(Thread.currentThread().getName());
                    
                    switch (turno.getTurno()) {
                        case "Hilo 1":
                            turno.setTurno("Hilo 2");
                            break;
                        case "Hilo 2":
                            turno.setTurno("Hilo 3");
                            break;
                        case "Hilo 3":
                            turno.setTurno("Hilo 1");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    semaforo.release();
                }
            } catch (InterruptedException ex) {
                //F
            }

        }
    }
}
