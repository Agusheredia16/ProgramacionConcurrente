package TP00;
/*
@author agush
*/
public class Hora {
    //Atributos
    private int hora;
    private int minutos;
    
    //Constructores
    public Hora(int hora, int minutos){
        this.hora = hora;
        this.minutos = minutos;
    }
    public Hora(){
        this.hora = 0;
        this.minutos = 0;
    }
    
    //Getters y setters
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
    
    //Metodos
    public void restarHoras(Hora hora2){
        this.hora = this.hora - hora2.getHora();
        this.minutos = this.minutos - hora2.getMinutos();
    }
}
