from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print("Creacion de objeto clase Cuadradro".center(50, "_"))
cuadrado1 = Cuadrado(5, "Azul")
cuadrado1.alto = -10
print("Cuadrado 1")
print(f"Ancho: {cuadrado1.ancho}")
print(f"Alto: {cuadrado1.alto}")
print(f"Calculo del area del cuadrado: {cuadrado1.calcular_area()}")

# MRO = Method Resolution Order
print(Cuadrado.mro())

print(cuadrado1)

cuadrado2 = Cuadrado(2, "Violeta")
print("Cuadrado 2")
print(f"Ancho: {cuadrado2.ancho}")
print(f"Alto: {cuadrado2.alto}")
print(f"Calculo del area del cuadrado: {cuadrado2.calcular_area()}")
print(cuadrado1)

rectangulo1 = Rectangulo(3, 2, "Rojo")
rectangulo1.ancho = 15
print("Rectangulo 1")
print(f"Ancho: {rectangulo1.ancho}")
print(f"Alto: {rectangulo1.alto}")
print(f"Calculo del area del rectangulo: {rectangulo1.calcular_area()}")
print(rectangulo1)
