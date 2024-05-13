resultado = None
a = "10"
b = 0

try:
    resultado = a / b # Modificamos
# Mas generico
except Exception as e:
    print(f"Ocurrio un error: {e}")
# Mas especifico
# except ZeroDivisionError as e:
# print(f"Ocurrio un error: {e}")

print(f"El resultado es: {resultado}")
print("seguimos...")