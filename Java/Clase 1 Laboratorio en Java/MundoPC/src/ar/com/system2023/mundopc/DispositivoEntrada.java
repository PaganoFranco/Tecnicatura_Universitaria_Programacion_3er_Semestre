
package ar.com.system2023.mundopc;


public class DispositivoEntrada {
    /* 
    Comenzamos creando los atributos
    */
    private String tipoEntrada;
    private String marca;
    
    /*
    creamos el constructor
    */
    
    public DispositivoEntrada(String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    /*
    Creamos los getter and setter
    */

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    /*
    Creamos el toString
    */

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }
       
}
