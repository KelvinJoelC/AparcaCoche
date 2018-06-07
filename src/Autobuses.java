public class Autobuses extends Vehiculos{
    int numPlazas;
    String compañia;


    //Método constructor
    public Autobuses (String matricula, String marca, String modelo){
        super(matricula,marca,modelo);
        this.numPlazas = numPlazas;
        this.compañia = compañia;
    }

    //Getter & Setter
    public int getNumPlazas() {
        return numPlazas;
    }
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    public String getCompañia() {
        return compañia;
    }
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }


}
