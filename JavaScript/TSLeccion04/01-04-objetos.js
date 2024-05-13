let x = 10; // Variable de tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30,
    idioma: "es",
    get lang(){
        return this.idioma.toUpperCase(); //Convierte las minusculas a mayusculas 
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //método o funcion en JavaScript
        return this.nombre + " "+ this.apellido
    },
    get nombreEdad(){ //Este es el meotodo get
        return "El Nombre es: " + this.nombre + " Edad: " + this.edad;
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());
console.log("Ejecutando con un objeto");
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Franco"
persona2.direccion = "Av. Roca 1801"
persona2.telefono = "2604694746"
console.log(persona2.telefono);
console.log("Creamos un nuevo objeto");
console.log(persona["apellido"]); // Accedemos como si fuera un arreglo
console.log("Usamos el ciclo for in")
// for inr 
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log("Cambiamos y eliminamos un error");
// Agregar, cambiar y eliminar propiedades de un objeto
persona.apellido = "Perez"; // Cambiar dinamicamente un valor del objeto
console.log(persona.apellido);

persona.apellida = "Perez"; // Agregar dinamicamente un valor del objeto
console.log(persona.apellida);

persona.apellida = "Siri"
console.log(persona);
delete persona.apellida; //Elimina el error
//console.log(persona.apellida);
console.log(persona);

//Distintas forma de imprimir un objeto
//N°1 : la mas sencilla: concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objeto: ")
console.log("Forma 1: concatenando propiedades");
console.log(persona.nombre+", "+persona.apellido);

//N°2: A traves del ciclo for in
console.log("Forma 2: ciclo for in");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//N°3: La funcion Objet.values()
console.log("Forma 3: funcion Object.values()");
let personaArrray = Object.values(persona);
console.log(personaArrray);

//N°4: Utilizaremos el método JSON.stringifi
console.log("Forma 4: método JSON.stringifi");
let personaString = JSON.stringify(persona);
console.log(personaString)

// Llamamos al metodo get
console.log("Comenzamos a utilizar el metodo get: ")
console.log(persona.nombreEdad);

console.log("Comenzamos con el metodo get y set para idiomas")
persona.lang = "en";
console.log(persona.lang);