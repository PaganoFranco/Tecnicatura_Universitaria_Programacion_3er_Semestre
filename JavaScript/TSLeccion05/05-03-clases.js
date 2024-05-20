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
}

class Empleado extends Persona{
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
console.log(empleado1.nombre);