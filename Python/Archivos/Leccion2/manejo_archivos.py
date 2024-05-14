# Declaramos una variable
try:
    archivo = open("prueba.txt", "w", encoding="utf8") # la "w" es de write que significa escribir
    archivo.write("Programamos con diferentes tipos de archivos, ahora en txt. \n")
    archivo.write("Los acentos son importantes para las palabras \n")
    archivo.write("como por ejemplo: ación, ejecución y producción \n")
    archivo.write("Con esto terminamos")
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
# archivo.write("Todo quedo perfecto"): este es un error porque el archivo ya se cerro

