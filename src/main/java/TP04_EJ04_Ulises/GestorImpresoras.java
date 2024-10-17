package TP04_EJ04_Ulises;
/*
@author agush
*/
public class GestorImpresoras {

    private final Impresora[] impresoras;

    public GestorImpresoras(Impresora[] imp) {
        impresoras = imp;
    }

//    public Impresora buscarImpresora(char tipoImpresora) {
//        int i = 0;
//        Impresora impresora=null;
//        boolean rta = false;
//        while (!rta && i < impresoras.length) {
//            if (impresoras[i].getNombre() == tipoImpresora) {
//                impresora = impresoras[i];
//                rta = true;
//            } else {
//                i++;
//            }
//        }
//        return impresora;
//    }
    public Impresora buscarImpresora(char tipoImpresora) {
        int i = 0;
        Impresora impresora = null;
        while (impresoras[i].getNombre() == tipoImpresora && i < impresoras.length) {
            if (impresoras[i].intentarAdquirirImpresora()) {
                impresora = impresoras[i];
            } else {
                i++;
            }
        }
        if (impresora == null) {
            impresora = impresoras[i];
        }
        return impresora;
    }
}