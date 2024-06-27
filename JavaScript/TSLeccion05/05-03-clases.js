// Histing ¿
//let persona3 = new Persona("Juan Pablo", "Del Pozzi"); Esto no se puede hacer

class Persona{ //Clase padre

    static constadorPersonas = 0; //Atributo estatico
    //email = "Valor default email"; //Atributo no estatico

    static get MAX_OBJ(){ //Este metodo simula una constante
        return 5;
    }

    //Creamos un constructor
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.constadorPersonas < Persona.MAX_OBJ){
        this.idPersona = ++Persona.constadorPersonas;
        }
        else{
            console.log("Se a superado el maximo de objetos creados")
        }
    }

    //Creamos el metodo get
    get nombre(){
        return this._nombre;
    }

    get apellido(){
        return this._apellido;
    }

    //Creamos el metodo set
    set nombre(nombre){
        this._nombre = nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona+" "+this._nombre + " " + this.apellido;
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){ //Regresa un String
        //se aplica el polimorfismo que significa = multiples formas en tiempos de ejecucion 
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log("Saludos desde este metodo static");
    }

    static saludar2(persona){
        console.log(persona.nombre+ " "+ persona.apellido);
    }
}

class Empleado extends Persona{ //Clase Hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura 
    nombreCompleto(){
        return super.nombreCompleto() + ", "+ this._departamento;
    }

}


//Creamos objetos
let persona1 = new Persona("Franco", "Pagano");
//Visualizamos el nombre por medio del metodo get
console.log(persona1.nombre);
//Modificamos el nombre por medio del metodo set
persona1.nombre = "Oscar";
console.log(persona1.nombre);
//console.log(persona1);

let persona2 = new Persona("Julieta", "Quiroga");
//Visualizamos el apellido por medio del metodo set
console.log(persona2.apellido);
//Modificamos el apellido por medio del metodo set
persona2.apellido = "Pagano";
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado("Juan", "Perez", "Sistemas");
console.log(empleado1);
console.log(empleado1.nombreCompleto());

// Object.prototype.toString Esta es la manera de acceder a atributos y metodos de manera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

//persona1.saludar(); No se utiliza desde el objeto
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.constadorObjetosPersona);
console.log(Persona.constadorObjetosPersona);
console.log(Empleado.constadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No se puede acceder desde la clase, ya que no es estatico
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.constadorPersonas);
let persona3 = new Persona("Carla", "Pampera");
console.log(persona3.toString());
console.log(Persona.constadorPersonas);

console.log(Persona.MAX_OBJ); 
Persona.MAX_OBJ = 10; // No se puede modificar, ni alterar
console.log(Persona.MAX_OBJ); 

let persona4 = new Persona("Franco", "Pantaley");
console.log(persona4.toString());
let persona5 = new Persona("Julieta", "Fernandez");
console.log(persona5.toString());