
package test;

import domain.*;

public class TesteSobreescritura {
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Juan", 1000);
       imprimir(empleado1);
       // System.out.println("empleado1 = " + empleado1.obtenerDetalles());

       empleado1 = new Gerente("Franco", 5000, "Sistemas");
       // System.out.println("gerente1 = " + gerente1.obtenerDetalles());
       imprimir(empleado1);
    }
    
    public static void imprimir(Empleado empleado) {
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
    
    
}
