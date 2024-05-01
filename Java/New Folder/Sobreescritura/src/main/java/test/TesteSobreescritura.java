
package test;

import domain.*;

public class TesteSobreescritura {
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Juan", 1000);
       imprimir(empleado1);
       // System.out.println("empleado1 = " + empleado1.obtenerDetalles());

       Gerente gerente1 = new Gerente("Franco", 5000, "Sistemas");
       // System.out.println("gerente1 = " + gerente1.obtenerDetalles());
       imprimir(gerente1);
    }
    
    public static void imprimir(Empleado empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
    
}
