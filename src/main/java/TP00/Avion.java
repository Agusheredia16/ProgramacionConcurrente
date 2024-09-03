package TP00;
/**
 * @author agush
 */
public class Avion extends Vehiculo{    //CONSULTAR: Si cambio el "public" por "abstract" me sale una advertencia en el constructor
                                        //de Alquiler
    private double envergadura;
    
    //Constructores
    public Avion(String matricula, double envergadura, int anioFab){
        super(matricula, anioFab);
        this.envergadura = envergadura;
    }
    public Avion(){
        super();
        this.envergadura = 0;
    }
    
    //Getters y setters
    public double getEnvergadura(){
        return envergadura;
    }
    public void setEnvergadura(double envergadura){
        this.envergadura = envergadura;
    }
    
    //metodos
    public double getModulo(){
        return (getEnvergadura() * 20);
    }
    
    public static void main(String[] args) {
        
        
        
        
    }
}
