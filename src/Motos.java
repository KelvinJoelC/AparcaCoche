public class Motos extends Vehiculos{
    int cilindrada;
    //Método constructor
    public Motos(String matricula,String marca, String modelo){
        super(matricula, marca,modelo);
        this.cilindrada = cilindrada;
    }
    //Getters & setters
    protected int getCilindrada() {
        return cilindrada;
    }
    protected void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
}
