package test;

import enumeraciones.Dias;
import enumeraciones.Continentes;

public class testEnumeraciones {

    public static void main(String[] args) {
        /*
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiasSemana(Dias.LUNES); //Las enumeraciones se tratan como cadenas
        */
        //No se deben usar comillas, se accede a traves de el operador de pundo
        System.out.println("Continente N:4 " + Continentes.AFRICA);
        //Podemos ver el numero de paises
        System.out.println("N° de paises en el 4to continente: " + Continentes.AFRICA.getPaises());
        //Podemos ver el numero de habitantes
        System.out.println("N° de paises en el 4to continente: " + Continentes.AFRICA.getHabitantes());
        
        //Tarea pones de cada pais el N°, paises y habitantes
        System.out.println("Continente N:4 " + Continentes.AMERICA);
        System.out.println("N° de paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println("N° de paises en el 4to continente: " + Continentes.AMERICA.getHabitantes());
        
        System.out.println("Continente N:4 " + Continentes.ASIA);
        System.out.println("N° de paises en el 4to continente: " + Continentes.ASIA.getPaises());
        System.out.println("N° de paises en el 4to continente: " + Continentes.ASIA.getHabitantes());
        
        System.out.println("Continente N:4 " + Continentes.EUROPA);
        System.out.println("N° de paises en el 4to continente: " + Continentes.EUROPA.getPaises());
        System.out.println("N° de paises en el 4to continente: " + Continentes.EUROPA.getHabitantes());
        
        System.out.println("Continente N:4 " + Continentes.OCEANIA);
        System.out.println("N° de paises en el 4to continente: " + Continentes.OCEANIA.getPaises());
        System.out.println("N° de paises en el 4to continente: " + Continentes.OCEANIA.getHabitantes());
        
    }

    private static void indicarDiasSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            //AGREGAR todos lod dias de la semana
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            //AGREGAR default
            default:
                System.out.println("Error: No es un día de la semana");
        }

    }
}
