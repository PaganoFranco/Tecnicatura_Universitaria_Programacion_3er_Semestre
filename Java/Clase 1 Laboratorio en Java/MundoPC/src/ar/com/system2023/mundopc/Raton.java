
package ar.com.system2023.mundopc;
/*
Creamos la clase Hija llamada Raton de la clase Padre DispositivoEntrada
*/
public class Raton extends DispositivoEntrada{
    //Creamos los atributos de la clase Hija
    private final int idRaton;
    private static int contadorRatones;
    
    //Creamos el constructor
    public Raton(String tipoEntrada, String marca){
        //llamamos a los atributos de la clase padre
        super(tipoEntrada, marca);
        //al idRaton, lo creamos con su respectivo incremento
        this.idRaton = ++Raton.contadorRatones;
    }
    
    //Creamos el toString

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", "+super.toString()+'}';
    }
    
}
