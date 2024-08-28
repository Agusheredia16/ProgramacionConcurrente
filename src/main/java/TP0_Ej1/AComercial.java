package TP0_Ej1;

/*
@author agush
 */
public class AComercial extends Avion {

    //Atributos
    private int HP;
    private int cantPasajeros;

    //Constructores
    public AComercial(String matricula, double envergadura, int anioFab, int HP, int cantPasajeros) {
        super(matricula, envergadura, anioFab);
        this.HP = HP;
        this.cantPasajeros = cantPasajeros;
    }

    public AComercial() {
        super();
        this.HP = 0;
        this.cantPasajeros = 0;
    }

    //Getters y setters
    public int getHP() {
        return HP;
    }
    public int getCantPasajeros(){
        return cantPasajeros;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public void setCantPasajeros(int cantPasajeros){
        this.cantPasajeros = cantPasajeros;
    }
    
    //Metodos
    @Override
    public double getModulo(){
        return (super.getModulo() + HP + cantPasajeros);
    }
}
