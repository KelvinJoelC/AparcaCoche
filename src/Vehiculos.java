public class Vehiculos {
    //1ºDefino los atributos en común que van a tener todos los vehiculos
    String matricula;
    String marca;
    String modelo;


    /*Implemento el método constructor, es obligatorio que sea público
    y tenga el mismo nombre que la clase*/

    public Vehiculos(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters and Setters
    protected String getMatricula(){
        return matricula;
    }
    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    protected String getMarca(){
        return marca;
    }
    protected  void setMarca(String marca){
        this.marca = marca;
    }
    protected  String getModelo(){
        return modelo;
    }
    protected void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo [Matricula= " + matricula + ",marca= "+
                marca + "modelo= "+ modelo + "]";
    }
}
