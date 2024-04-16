/*
Ejercicio 5: Realizar un juego para adivinar un numero,
para ello generar un numero aleatorio entre 0-100, y 
luego ir pidiendo numeros indicando "es mayor" o "es
menor" segun sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos
el numero de intentos hechos. 
 */

const aleatorio = Math.floor(Math.random() * 100); // Genera un número aleatorio entre 0 y 99
let contador = 0;
let numero = parseInt(prompt("Ingrese un numero: "));
    
do {
    if (numero < aleatorio) {
        numero = parseInt(prompt("Ingrese un numero mayor."));
    } else if (numero > aleatorio) {
        numero = parseInt(prompt("Ingrese un numero menor."));
    } else {
        alert("¡TENEMOS UN GANADOR!");
    }
    contador++;
} while (numero !== aleatorio);

alert(`Adivinaste el numero en: ${contador} intentos`);