
package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodos de la clase Escritor
        //empleado.getTipoEscritura(); No se puede llamar de forma directa, debemos hacer una conversion
        
        //DOWCASTING
        //Primera forma 
        //((Escritor)empleado).getTipoEscritura(); //Convertimos de Padre a Hijo
        //Segunda forma
        Escritor escritor =(Escritor)empleado;
        System.out.println(escritor.getTipoEscritura());
        
        //UPCASTING
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
}
