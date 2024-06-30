import java.util.Scanner;
public class CalculadoraUTN {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {//Ciclo infinito
            System.out.println("****** Aplicacion Calculadora ******");
            mostrarMenu();

            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 & operacion <= 4) {

                    ejecurtarOperacion(operacion, entrada);
                }// Fin del if
                else if(operacion == 5){
                    System.out.println("Hasta pronto ...");
                    break; // Rompe el ciclo
                }
                else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                // Imprimimos un salto de lina antes de repetir el menu
                System.out.println();
            } //Fin del tru
            catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getLocalizedMessage());
                System.out.println();
            } // Fin del catch
        } // Fin While
    } // Fin main

    private static void mostrarMenu(){
        //Mostrar el menu:
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5 . Salir
                """);
        System.out.print("¿Operacion a realizar? ");
    }// Fin metodo mostrar menu

    private static void ejecurtarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando 1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando 2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());

        double resultado;
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
    } // Fin metodo ejecurtarOperacion
} // Fin class
