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