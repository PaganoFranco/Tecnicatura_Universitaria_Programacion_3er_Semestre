
package test;

import static aritmetica.Artimetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrio un Error");
            e.printStackTrace(System.out); // Se conoce como la pila de excepciones
            System.out.println("");
        }
        finally{
        System.out.println("Se revieso la division entre cero");
        }
        System.out.println("La vairable de resultado tiene como valor "+resultado);
    }
}
