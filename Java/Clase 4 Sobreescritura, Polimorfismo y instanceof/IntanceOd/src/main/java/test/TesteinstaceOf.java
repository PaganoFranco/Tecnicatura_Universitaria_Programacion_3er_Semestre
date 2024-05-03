
package test;

import domain.*;

public class TesteinstaceOf {
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Juan", 1000);
       determinarTipo(empleado1);
       empleado1 = new Gerente("Franco", 5000, "Sistemas");
       determinarTipo(empleado1);
    }
    
    public static void determinarTipo(Empleado empleado) {
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //((Gerente) empleado).getDepartamento(); //Forma abreviada
            //Forma larga: 
            Gerente gerente = (Gerente)empleado;
            gerente.getDepartamento();
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("empleado = " + empleado.getNombre());
        } 
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
