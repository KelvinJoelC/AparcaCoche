public class Coches extends Vehiculos{
    String dni;
    boolean electrico;
    //Método constructor
    public Coches(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.dni = dni;
        this.electrico = electrico;
    }
    //Getter & Setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public boolean isElectrico() {
        return electrico;
    }
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }


}
