miFuncion(8, 2); //Podemos llamar a la funcion en cualquier momento, este antes
// o despues de las misma "HOSTING" 

function miFuncion(a, b){
    //console.log("suma: " + (a+b));
    return a + b;
}

//Llamamos a la funcion
miFuncion(5, 4);

let resultado = miFuncion(6, 7);
console.log(resultado);

//Declaramos una funcion de tipo expresion o anonima 
let x = function(a, b){return a + b}; //Necesita cierre con punto y coma
resultado = x(5, 6); // al llamar se pone la variable y parentesis
console.log(resultado);

//Funciones de tipo self y invoking
(function(a, b){
    console.log("Ejecutando la funcion: " + (a+b));
}) (9,6);

console.log(typeof miFuncion);
function miFuncion2(a, b){
    console.log(arguments.length);
}

miFuncion2(5, 7, 3, 6);

//toString
var miFuncionTexto = miFuncion2.toString();
console.log(miFuncionTexto);

//Funciones flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7); //Asignamos el valor a una variable
console.log(resultado);

//Funcion tipo expresion
let sumar = function(a = 4, b = 8){
    console.log(arguments[0]); //Muestra el parametro de: a
    console.log(arguments[1]); //Muestra el parametro de: b
    return a + b + (arguments[2]);
}

resultado = sumar(3, 2, 9);
console.log(resultado);

//Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10, 9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//Tipos primitivos
let k = 10;
function camviarValor(a){ //Paso por valor
    a = 20;
}

camviarValor(k);
console.log(k);