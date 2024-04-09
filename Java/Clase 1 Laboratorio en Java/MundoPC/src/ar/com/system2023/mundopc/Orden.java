
package ar.com.system2023.mundopc;

/**
Creamos la clase Orden
 */
public class Orden {
    //Creamos sus atributos
    private final int idOrden;
    private Computadora computadora[]; //Arreglo de objetos
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadora;
    
    //Creamos el contructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //Creamos el metodo para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora){
        //Verificamos el contador de computadora que no supere el maximo.
        if(this.contadorComputadora < Orden.MAX_COMPUTADORAS){
            //Si esta dentro del rango, complimos la condicion de agregado
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else{
            System.out.println("Has superado el limite "+Orden.MAX_COMPUTADORAS);
        }
    }
    
    //Mostrar orden
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadora de la orden #: "+this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
}
