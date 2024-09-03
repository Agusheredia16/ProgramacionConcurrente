package TP01_EJ08;
/*
@author agush
 */
public class PruebaExcep {

    public static void main(String[] args) {
        //Metodo es menor
        try {
            esMenor(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Metodo ruleta
        try {
            ruleta(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Metodo coleccion
        try {
            coleccion();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void esMenor(int edad) throws Exception {
        if (edad >= 18) {
            System.out.println("Todo en orden");
        } else {
            throw new Exception("Es menor");
        }
    }

    public static void ruleta(int numero) throws Exception {
        int numeroAleatorio = (int) (Math.random() * 37);
        if (numero == numeroAleatorio) {
            System.out.println("Todo en orden");
        } else {
            throw new Exception("No ganaste :c");
        }
    }

    public static void coleccion() throws ArrayIndexOutOfBoundsException {
        int[] elArray = new int[5];
        for (int i = 0; i < elArray.length; i++) {
            elArray[i] = i;
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(elArray[i]);
        }
    }

}
