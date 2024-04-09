
package ar.com.system2023.mundopc;

/**
Creamos la clase Monitor
 */
public class Monitor {
    //Creamos sus atributos
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;
    
    //Creamos un constructor basico para inicializar 
    //el contador y con el, el valor del id
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitor;
    } 
    
    //creamos el constructor publico
    public Monitor (String marca, double tamanio){
        this(); //Llamado al constructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    //Creamos los getter and setter 

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    //Ingresamos manualmente el gettdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    //Creamos el toString

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
