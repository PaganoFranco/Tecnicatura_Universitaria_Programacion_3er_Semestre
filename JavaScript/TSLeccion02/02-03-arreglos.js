// Un arreglo es un tipo objeto
// Formas de declarar un arreglo:

// let autos = new Array("Ferrari", "Renaul", "BMW"); SINTAXIS VIEJA 

const autos = ["Ferrari", "Renaul", "BMW"];
console.log(autos);

//Recorremos los elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+": "+autos[i])
}

// Modificamos los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[1]);

// Agregar nuevos valores al arreglo
autos.push("Audi"); // Este nuevo elementos se agrega al final
console.log(autos);

// Otra forma de agregar elementos
autos[autos.length] = "Proche";
console.log(autos);

//Tercera forma de agreghar elementos teniendo CUIDADO
autos[6] = "Renault";
console.log(autos);

// Como preguntar si es una Array o Arreglo
console.log(Array.isArray(autos)); // Devolvera un booleano

console.log(autos instanceof Array); // Pregunta si la variable es una instancia de la clase Array
