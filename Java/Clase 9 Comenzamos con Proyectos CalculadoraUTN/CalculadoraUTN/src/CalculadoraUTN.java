import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraUTN {

    private static List<String> historial = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) { // Ciclo infinito
            System.out.println("****** Aplicacion Calculadora ******");
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 6) {
                    ejecutarOperacion(operacion, entrada);
                } else if (operacion == 7) {
                    mostrarHistorial();
                } else if (operacion == 8) {
                    System.out.println("Hasta pronto ...");
                    break; // Rompe el ciclo
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                // Imprimimos un salto de línea antes de repetir el menu
                System.out.println();
            } // Fin del try
            catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                System.out.println();
            } // Fin del catch
            catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getLocalizedMessage());
                System.out.println();
            } // Fin del catch
        } // Fin While
    } // Fin main

    private static void mostrarMenu() {
        // Mostrar el menú:
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Potencia
                6. Raíz Cuadrada
                7. Ver Historial
                8. Salir
                """);
        System.out.print("¿Operación a realizar? ");
    } // Fin método mostrar menú

    private static void ejecutarOperacion(int operacion, Scanner entrada) {
        double operando1, operando2 = 0, resultado = 0;
        boolean requiereSegundoOperando = operacion != 6; // La raíz cuadrada solo necesita un operando

        System.out.print("Digite el valor para el operando 1: ");
        operando1 = Double.parseDouble(entrada.nextLine());

        if (requiereSegundoOperando) {
            System.out.print("Digite el valor para el operando 2: ");
            operando2 = Double.parseDouble(entrada.nextLine());
        }

        switch (operacion) {
            case 1 -> { // SUMA
                resultado = operando1 + operando2;
                guardarHistorial("Suma", operando1, operando2, resultado);
            }
            case 2 -> { // RESTA
                resultado = operando1 - operando2;
                guardarHistorial("Resta", operando1, operando2, resultado);
            }
            case 3 -> { // MULTIPLICACIÓN
                resultado = operando1 * operando2;
                guardarHistorial("Multiplicación", operando1, operando2, resultado);
            }
            case 4 -> { // DIVISIÓN
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                    guardarHistorial("División", operando1, operando2, resultado);
                } else {
                    System.out.println("Error: División por cero.");
                    return;
                }
            }
            case 5 -> { // POTENCIA
                resultado = Math.pow(operando1, operando2);
                guardarHistorial("Potencia", operando1, operando2, resultado);
            }
            case 6 -> { // RAÍZ CUADRADA
                if (operando1 >= 0) {
                    resultado = Math.sqrt(operando1);
                    guardarHistorial("Raíz Cuadrada", operando1, resultado);
                } else {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    return;
                }
            }
            default -> System.out.println("Operación errónea: " + operacion);
        } // Fin switch
        System.out.println("Resultado = " + resultado);
    } // Fin método ejecutarOperacion

    private static void guardarHistorial(String operacion, double operando1, double operando2, double resultado) {
        historial.add(operacion + ": " + operando1 + " y " + operando2 + " = " + resultado);
    }

    private static void guardarHistorial(String operacion, double operando1, double resultado) {
        historial.add(operacion + ": " + operando1 + " = " + resultado);
    }

    private static void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay operaciones en el historial.");
        } else {
            System.out.println("Historial de operaciones:");
            for (String registro : historial) {
                System.out.println(registro);
            }
        }
    }
} // Fin class
