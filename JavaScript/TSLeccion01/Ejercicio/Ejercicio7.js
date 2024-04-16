/*
Ejericio 7: Pedir numeros hasta que se introduzca uno negativo
y calcular la media
*/
let numero = parseInt(prompt("Ingrese un numero: "));
let suma = 0;
let promedio = 0;
let contador = 0;

while(numero >= 0){
    suma += numero;
    contador ++;
    numero = parseInt(prompt("Ingrese otro numero: "));
}
if(contador != 0){
        promedio = suma/contador;
        alert(`El promedio es: ${promedio}`);
}else{
    alert("Ingreso primero un numero negativo: ");
}