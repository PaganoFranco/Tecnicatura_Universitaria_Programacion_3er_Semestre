import java.util.Scanner;
public class CalculadoraUTN {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("****** Aplicacion Calculadora ******");
        //Mostrar el menu:
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5 . Salir
                """);
        System.out.print("¿Operacion a realizar? ");
        var operacion = Integer.parseInt(entrada.nextLine());

        if (operacion >= 1 & operacion <= 4) {
            System.out.print("Digite el valor para el operando 1: ");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite el valor para el operando 2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());

            int resultado;
            switch (operacion){
                case 1 -> { //SUMA
                    resultado = operando1 + operando2;
                    System.out.println("Resultado de la suma = " + resultado);
                }
                case 2 -> { //RESTA
                    resultado = operando1 - operando2;
                    System.out.println("Resultado de la resta = " + resultado);
                }
                case 3 -> { //MULTIPLICACION
                    resultado = operando1 * operando2;
                    System.out.println("Resultado de la multiplicacion = " + resultado);
                }
                case 4 -> { //DIVISION
                    resultado = operando1 / operando2;
                    System.out.println("Resultado de la division = " + resultado);
                }
                default -> System.out.println("Operacion erronea: "+operacion);
            } // Fin switch
        }// Fin del if
        else if(operacion == 5){
            System.out.println("Hasta pronto ...");
        }
        else {
            System.out.println("Opcion erronea: " + operacion);
        }
    } // Fin main
} // Fin class
