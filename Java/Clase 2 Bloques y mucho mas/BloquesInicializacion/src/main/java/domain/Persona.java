package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    //creamos el bloque de inicializacion estatico
    static{
        System.out.println("Ejercicio del bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; No es estatico por esto tenemos un error.
        
        //Este bloque permite inicializar las vaiables del tipo statico
    } 
    
    {//Bloque de inicializacion NO ESTATICO (Contexto Dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
    }
    
    //Los bloques de incializacion se ejecutan antes del contructor
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
