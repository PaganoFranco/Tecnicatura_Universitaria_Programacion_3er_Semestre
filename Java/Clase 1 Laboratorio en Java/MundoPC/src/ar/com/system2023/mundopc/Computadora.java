
package ar.com.system2023.mundopc;

/**
Creamos la clase computadora
 */
public class Computadora {
  //Creamos sus atributos
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
  //Creamos el contructor vacio
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    
  //Creamos el contructor publico
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this(); //Llamamos al contructor vacio
        this.nombre = nombre; 
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton; 
        
    }
    
  //Creamos los getter and setter
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
  //Ingresamos manualmente el gettdComputadora
    public int getIdComputadora(){
        return idComputadora;
    }
  
  //Creamos el toString
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
}
