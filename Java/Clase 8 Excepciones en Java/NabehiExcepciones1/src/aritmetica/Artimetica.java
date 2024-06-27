
package aritmetica;

import excepciones.OperacionExcepcion;


public class Artimetica {
    public static int division(int numerador, int denominador) 
            throws OperacionExcepcion{
        if (denominador == 0){
            throw new OperacionExcepcion("Dividir entre cero");
        }
        return numerador / denominador;
    }
}
