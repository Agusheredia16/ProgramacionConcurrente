package TP03_EJ04;

/*
@author agush
 */
public class Area {

    private boolean espacio1 = false;
    private boolean espacio2 = false;
    private boolean espacio3 = false;

    public synchronized boolean reservarEspacio(int nroRandom) {
        if (nroRandom == 1 && espacio1 == false) {
            espacio1 = true;
            return true;
        }
        if (nroRandom == 2 && espacio2 == false) {
            espacio2 = true;
            return true;
        }
        if (nroRandom == 3 && espacio3 == false) {
            espacio3 = true;
            return true;
        }
        return false;
    }

}
