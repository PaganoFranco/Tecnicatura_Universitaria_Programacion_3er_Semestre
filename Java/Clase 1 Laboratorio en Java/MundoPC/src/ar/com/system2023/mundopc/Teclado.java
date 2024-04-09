
package ar.com.system2023.mundopc;

/**
Creamos la clase Hija llamada Teclado de la clase Padre DispositivoEntrada
*/
public class Teclado extends DispositivoEntrada{
    //Creamos los atributos de la clase Hija
    private final int idTeclado;
    private static int contadorTeclado;
    
    //Creamos el constructor
    public Teclado(String tipoEntrada, String marca){
        //llamamos a los atributos de la clase padre
        super(tipoEntrada, marca);
        //al idRaton, lo creamos con su respectivo incremento
        this.idTeclado = ++Teclado.contadorTeclado;
    }
    
    //Creamos el toString

    @Override
    public String toString() {
        return "Teckadi{" + "idTeclado=" + idTeclado + ", "+super.toString()+'}';
    }
    
}
