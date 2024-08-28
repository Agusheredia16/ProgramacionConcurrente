package TP0_Ej1;
/*
@author agush
 */
public class AlquilerA extends Alquiler{

    //Atributos
    private Fecha fechaInicio;
    private Fecha fechaFin;
    private Hora horaInicio;
    private Hora horaFin;
    private Avion avion;
    private int valorFijo;

    //Constructores
    public AlquilerA(Cliente cliente ,Fecha fechaInicio, Fecha fechaFin, Hora horaInicio, Hora horaFin, int numeroEstacionamiento, Avion avion, int valorFijo) {
        super(cliente, numeroEstacionamiento);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.avion = avion;
        this.valorFijo = valorFijo;
    }
    public AlquilerA(){
        super();
        this.fechaInicio = null;
        this.fechaFin = null;
        this.horaInicio = null;
        this.horaFin = null;
        this.avion = null;
        this.valorFijo = 0;
    }

    //Getters y setters
    public Fecha getFechaInicio(){
        return fechaInicio;
    }
    public Fecha getFechaFin(){
        return fechaFin;
    }
    public Hora getHoraInicio(){
        return horaInicio;
    }
    public Hora getHoraFin(){
        return horaFin;
    }
    public Avion getAvion(){
        return avion;
    }
    public int getValorFijo(){
        return valorFijo;
    }
    public void setFechaInicio(Fecha fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(Fecha fechaFin){
        this.fechaFin = fechaFin;
    }
    public void setHoraInicio(Hora horaInicio){
        this.horaInicio = horaInicio;
    }
    public void setHoraFin(Hora horaFin){
        this.horaFin = horaFin;
    }
    public void setAvion(Avion avion){
        this.avion = avion;
    }
    public void setValorFijo(int valorFijo){
        this.valorFijo = valorFijo;
    }
    
    //Metodos
    public double calcularAlquiler(){
        int duracion;
        double modulo, valor;
        
        modulo = avion.getModulo();
        duracion = calcularDuracion(); //Calcula la duracion en horas
        valor = getValorFijo() + modulo + duracion;
        
        return valor;
    }
    
    public int calcularDuracion(){
        //Este es un metodo basico para calcular la duracion en horas del alquiler de un hangar de avion
        //Solo funciona en alquileres que empiecen y finalicen en el mismo mes. No si tienen meses o años distintos
        return ((fechaFin.getDia() - fechaInicio.getDia() - 1) * 24) + 24 - horaInicio.getHora() + horaFin.getHora();
    }
    
    
}