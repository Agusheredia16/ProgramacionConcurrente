package TP04_EJ01;

/*
@author agush
 */
public class SynchronizedCounter {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
