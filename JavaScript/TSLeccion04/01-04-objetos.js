let x = 10; // Variable de tipo primitiva
console.log(x.length);

//Objeto
let persona = {
    nombre: "Carlos",
    apellido: "Gil",
    email: "cgil@gmail.com",
    edad: 30,
    nombreCompleto: function(){ //método o funcion en JavaScript
        return this.nombre + " "+ this.apellido
    }
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Franco"
persona2.direccion = "Av. Roca 1801"
persona2.telefono = "2604694746"
console.log(persona2.telefono);

console.log(persona["apellido"]); // Accedemos como si fuera un arreglo

// for inr 
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

// Agregar, cambiar y eliminar propiedades de un objeto
persona.apellido = "Perez"; // Cambiar dinamicamente un valor del objeto
console.log(persona.apellido);

persona.apellida = "Perez"; // Agregar dinamicamente un valor del objeto
console.log(persona.apellida);

persona.apellida = "Siri"
delete persona.apellida; //Elimina el error
console.log(persona.apellida);