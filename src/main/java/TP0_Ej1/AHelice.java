package TP0_Ej1;
/*
@author agush
*/
public class AHelice extends Avion {
    //Atributos
    private int HP;
    
    //Constructor
    public AHelice(String matricula, double envergadura, int anioFab, int HP){
        super(matricula, envergadura, anioFab);
        this.HP = HP;
    }
    public AHelice(){
        super();
        this.HP = 0;
    }
    
    //Getters y setters
    public int getHP(){
        return HP;
    }
    public void setHP(int HP){
        this.HP = HP;
    }
    
    //Metodos
    @Override
    public double getModulo(){
        return (super.getModulo() + HP);
    }
}
