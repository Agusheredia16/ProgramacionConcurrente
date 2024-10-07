package TP03_EJ03_V4_GPT;

/*
@author agush
 */
class Jaula {

    // Métodos sincronizados para asegurar la exclusión mutua en los recursos
    public synchronized void comer(String nombre) throws InterruptedException {
        System.out.println(nombre + " está comiendo...");
        Thread.sleep(2000);  // Simula el tiempo que toma comer
        System.out.println(nombre + " terminó de comer.");
    }

    public synchronized void correr(String nombre) throws InterruptedException {
        System.out.println(nombre + " está corriendo en la rueda...");
        Thread.sleep(3000);  // Simula el tiempo que toma correr en la rueda
        System.out.println(nombre + " terminó de correr.");
    }

    public synchronized void descansar(String nombre) throws InterruptedException {
        System.out.println(nombre + " está descansando en la hamaca...");
        Thread.sleep(1000);  // Simula el tiempo que toma descansar
        System.out.println(nombre + " terminó de descansar.");
    }
}
