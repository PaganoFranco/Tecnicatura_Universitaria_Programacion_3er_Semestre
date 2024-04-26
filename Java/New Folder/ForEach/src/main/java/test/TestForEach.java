
package test;

import domain.Persona;


public class TestForEach {
    public static void main(String[] args) {
        //El ForEach es un ciclo For mejorado
        int edades[] = {5, 6, 8, 9}; //Creamos un arreglo del tipo entero
        for (int edad: edades) { //Sintaxis del ForEach
            System.out.println("edad = " + edad);
            //Este metodo no te permite generar un indice y tampoco un contador
        }
        
        Persona personas[] = {new Persona("Franco"),new Persona("Juli"), new Persona("Juan Pablo")};
        for (Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
