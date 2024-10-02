package TP03_EJ01;
//ACA ESTA EL MAIN
/*
@author agush
 */
public class ElMain {

    public static void main(String[] args) {
        VerificarCuenta vc = new VerificarCuenta();
        Thread Luis = new Thread(vc, "Luis");
        Thread Manuel = new Thread(vc, "Manuel");
        Luis.start();
        Manuel.start();
    }

}
