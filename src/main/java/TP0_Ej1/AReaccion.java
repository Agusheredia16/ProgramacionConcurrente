package TP0_Ej1;
/*
@author agush
*/
public class AReaccion extends Avion {
    //Atributos
    private int cantMotores;

    //Constructores
    public AReaccion(String matricula, double envergadura, int anioFab, int cantMotores){
        super(matricula, envergadura, anioFab);
        this.cantMotores = cantMotores;
    }
    public AReaccion(){
        super();
        this.cantMotores = 0;
    }
    
    //Getters y setters
    public int getCantMotores(){
        return cantMotores;
    }
    public void setCantMotores(int cantMotores){
        this.cantMotores = cantMotores;
    }
    
    //Metodos
    @Override
    public double getModulo(){
        return (super.getModulo() + cantMotores);
    }
}
