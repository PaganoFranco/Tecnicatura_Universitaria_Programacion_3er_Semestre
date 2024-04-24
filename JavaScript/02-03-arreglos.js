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