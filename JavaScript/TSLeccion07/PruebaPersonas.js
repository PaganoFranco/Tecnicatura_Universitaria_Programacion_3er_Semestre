class Persona {
    static contadorPersonas = 0;

    constructor(nombre, apellido, edad) {
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    // Getters
    get idPersona() {
        return this._idPersona;
    }

    get nombre() {
        return this._nombre;
    }

    get apellido() {
        return this._apellido;
    }

    get edad() {
        return this._edad;
    }

    // Setters
    set nombre(nombre) {
        this._nombre = nombre;
    }

    set apellido(apellido) {
        this._apellido = apellido;
    }

    set edad(edad) {
        this._edad = edad;
    }

    toString(){
        return this._idPersona+" "+this._nombre+" "+this._apellido+" "+this._edad;
    }
}

class Empleado extends Persona {
    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo) {
        super(nombre, apellido, edad);
        this._idEmpleado = ++Empleado.contadorEmpleados;
        this._sueldo = sueldo;
    }

    // Getters
    get idEmpleado() {
        return this._idEmpleado;
    }

    get sueldo() {
        return this._sueldo;
    }

    // Setters
    set sueldo(sueldo) {
        this._sueldo = sueldo;
    }

    toString(){
        return super.toString()+" "+this._idEmpleado+" "+this._sueldo;
    }
}

class Cliente extends Persona {
    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro) {
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fecharegistro = fecharegistro;
    }

    // Getters
    get idCliente() {
        return this._idCliente;
    }

    get fecharegistro() {
        return this._fecharegistro;
    }

    // Setters
    set fecharegistro(fecharegistro) {
        this._fecharegistro = fecharegistro;
    }

    // toString
    toString() {
        return super.toString()+" "+ this._idCliente+" "+this.fecharegistro;
    }
}

//Prueba clase persona
let persona1 = new Persona("Franco", "Pagano", "27");
console.log(persona1.toString());

let persona2 = new Persona("Julieta", "Quiroga", "27");
console.log(persona2.toString());

//Prueba clase empleado
let empleado1 = new Empleado("Juan Pablo", "Del Pozzi", 28, 2000);
console.log(empleado1.toString());

let empleado2 = new Empleado("Paloma", "Quiroga", 26, 50);
console.log(empleado2.toString());

//Prueba clase Cliente
let cliente1 = new Empleado("Pepe", "Del Pozzi", 22, new Date());
console.log(cliente1.toString());

let cliente2 = new Empleado("Pepa", "Del Pozzi", 35, new Date());
console.log(cliente2.toString());
