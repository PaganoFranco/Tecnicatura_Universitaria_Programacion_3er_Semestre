from NumerosigualesException import NumerosigualesException

resultado = None

try:
    a = int(input("Digite el primer numero: "))
    b = int(input("Digite el segundo  numero: "))
    if a == b:
        raise NumerosigualesException("Son numeros iguales")
    resultado = a / b # Modificamos
# Mas especifico - Clases Hijas
except TypeError as e:
    print(f"TypeError - Ocurrio un error: {type(e)}")
except ZeroDivisionError as e:
    print(f"ZeroDivisionError - Ocurrio un error: {type(e)}")
# Mas generico - Clase Padre
except Exception as e:
    print(f"Exception - Ocurrio un error: {type(e)}")
else:
    print("No se arrojo ninguna excepcion")
finally:
    print("Ejercucion de este bloque finally")

print(f"El resultado es: {resultado}")
print("seguimos...")