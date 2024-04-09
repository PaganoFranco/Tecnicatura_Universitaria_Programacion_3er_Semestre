package mundoPC;

import ar.com.system2023.mundopc.*;

/**
 * Creamos la clase mundoPC
 */

//Tarea
        //1) Crear mas objetos de tipo computadora con todos sus elementos
        //2) Completar una lista en el objeto orden1 que llegue a los 10 elementos
        //3) probar de esta manera los metodos al maximo rendimiento
    
public class mundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //Importar la clase
        Teclado tecladoHP = new Teclado("Bluethoot", "HP");
        Raton ratonHP = new Raton("Bluethoot", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 32); //Importar la clase
        Teclado tecladoGamer = new Teclado("Bluethoot", "Gamer");
        Raton ratonGamer = new Raton("Bluethoot", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
       
    //1) Creamos mas objetos de tipo computadora con todos sus elementos
    // Computadora 1
        Monitor monitorAcer = new Monitor("Acer", 15);
        Teclado tecladoLogitech = new Teclado("USB", "Logitech");
        Raton ratonLogitech = new Raton("USB", "Logitech");
        Computadora computadora1 = new Computadora("Computadora 1", monitorAcer, tecladoLogitech, ratonLogitech);
    // Computadora 2
        Monitor monitorSamsung = new Monitor("Samsung", 17);
        Teclado tecladoDell = new Teclado("Bluethoot", "Dell");
        Raton ratonMicrosoft = new Raton("USB", "Microsoft");
        Computadora computadora2 = new Computadora("Computadora 2", monitorSamsung, tecladoDell, ratonMicrosoft);
    // Computadora 3
        Monitor monitorLG = new Monitor("LG", 19);
        Teclado tecladoHP2 = new Teclado("USB", "HP");
        Raton ratonDell = new Raton("Bluethoot", "Dell");
        Computadora computadora3 = new Computadora("Computadora 3", monitorLG, tecladoHP2, ratonDell);
    // Computadora 4
        Monitor monitorASUS = new Monitor("ASUS", 21);
        Teclado tecladoRazer = new Teclado("Bluethoot", "Razer");
        Raton ratonCorsair = new Raton("USB", "Corsair");
        Computadora computadora4 = new Computadora("Computadora 4", monitorASUS, tecladoRazer, ratonCorsair);
    // Computadora 5
        Monitor monitorSony = new Monitor("Sony", 23);
        Teclado tecladoSony = new Teclado("USB", "Sony");
        Raton ratonLogitech2 = new Raton("Bluethoot", "Logitech");
        Computadora computadora5 = new Computadora("Computadora 5", monitorSony, tecladoSony, ratonLogitech2);
    // Computadora 6
        Monitor monitorBenQ = new Monitor("BenQ", 25);
        Teclado tecladoCorsair = new Teclado("USB", "Corsair");
        Raton ratonSteelSeries = new Raton("USB", "SteelSeries");
        Computadora computadora6 = new Computadora("Computadora 6", monitorBenQ, tecladoCorsair, ratonSteelSeries);
    // Computadora 7
        Monitor monitorViewSonic = new Monitor("ViewSonic", 27);
        Teclado tecladoRazer2 = new Teclado("USB", "Razer");
        Raton ratonLogitech3 = new Raton("USB", "Logitech");
        Computadora computadora7 = new Computadora("Computadora 7", monitorViewSonic, tecladoRazer2, ratonLogitech3);
    // Computadora 8
        Monitor monitorDell = new Monitor("Dell", 24);
        Teclado tecladoMicrosoft = new Teclado("Bluethoot", "Microsoft");
        Raton ratonHP2 = new Raton("USB", "HP");
        Computadora computadora8 = new Computadora("Computadora 8", monitorDell, tecladoMicrosoft, ratonHP2);
    // Computadora 9
        Monitor monitorPhilips = new Monitor("Philips", 20);
        Teclado tecladoApple = new Teclado("USB", "Apple");
        Raton ratonApple = new Raton("USB", "Apple");
        Computadora computadora9 = new Computadora("Computadora 9", monitorPhilips, tecladoApple, ratonApple);

        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);

        
        Orden orden1 = new Orden(); //Iniciamos el arreglo vacio
        Orden orden2 = new Orden(); //Creamos una nueva lista
        //Le agregamos elementos al arreglo
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        //2) Le agregamos elementos a la Orden para llegar a las 10 computadoras
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora3);
        orden1.agregarComputadora(computadora4);
        orden1.agregarComputadora(computadora5);
        orden1.agregarComputadora(computadora6);
        orden1.agregarComputadora(computadora7);
        orden1.agregarComputadora(computadora8);
        //3) Le agregamos el onceavo elementos para verificar el maximo de la orden
        //Esta computadora no deberia visualizarse en la orden1
        orden1.agregarComputadora(computadora9); 
        
        //Le agregamos elementos al 2do arreglo
        orden2.agregarComputadora(computadorasVarias);

        //Visualizamos los arreglos
        orden1.mostrarOrden();
        orden2.mostrarOrden();

        }
}
