
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
            Clases envolventes de tipos primitivos
            int = la clase envolvente es integer
            long = la clase envolvente es long
            float = la clase envolvente es Float
            double = la clase envolvente es Boolean
            char = la clase envolvente es Character
            short = la clase envolvente es Short
        */
        
        int enteroPrim = 10; // Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10; // Tipo object con la clase Integer
        System.out.println("entero = " + entero.doubleValue()); // Autoboxing
        
        int entero2 = entero; // Unboxing
        System.out.println("entero2 = " + entero2);
        
    }
}
