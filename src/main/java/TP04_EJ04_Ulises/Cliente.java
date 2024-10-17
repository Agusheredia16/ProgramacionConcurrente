package TP04_EJ04_Ulises;
/*
@author agush
 */
public class Cliente implements Runnable {

    private String nombre;
    private Impresora impresora;
    private char tipoImpresora;
    private GestorImpresoras gestor;

    public Cliente(String nom, char ti, GestorImpresoras ges) {
        nombre = nom;
        tipoImpresora = ti;
        gestor = ges;
    }

    public char getTipo() {
        return tipoImpresora;
    }
    
    @Override
    public void run() {
        impresora = gestor.buscarImpresora(tipoImpresora);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000); // Simula el tiempo de impresiÃ³n
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("El Cliente " + nombre + " esta usando la impresora " + impresora.getNombre());
            impresora.liberarImpresora();
        }
    }
}
