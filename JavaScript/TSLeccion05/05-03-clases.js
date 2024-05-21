// Histing ¿
//let persona3 = new Persona("Juan Pablo", "Del Pozzi"); Esto no se puede hacer

class Persona{ //Clase padre
    //Creamos un constructor
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
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
        return this._nombre + " " + this.apellido;
    }

    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){ //Regresa un String
        //se aplica el polimorfismo que significa = multiples formas en tiempos de ejecucion 
        //El metodo que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
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