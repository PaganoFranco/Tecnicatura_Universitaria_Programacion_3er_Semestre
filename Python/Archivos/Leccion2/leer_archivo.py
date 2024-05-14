
archivo = open("C:\\Users\Franc\Tecnicatura_Universitaria_Programacion_3er_Semestre\Python\Archivos\Leccion2\prueba.txt", "r",
               encoding="utf8") # Las letras son: "r" read, "a" append, "w" write, "x"
# print(archivo.read())
# print(archivo.read(15))
# print(archivo.read(5)) # Continua desde la linea anterior
# print(archivo.readline())
# print(archivo.readline())

# vamos a iterar el archivo, cada una de las lineas
# for linea in archivo:
    # print(line) iteramos todos los elementos del archivo
    # print(archivo.readlines()) accedemos al archivo como si fuera una lista

# print(archivo.readlines()[n]) si cambiamos el n por cualquier numero accederemos
# a un parrafo de texto, o a los elementos de la lista.

# Anexamos informacion, copiamos a otro
archivo2 = open("copia.txt", "w", encoding="utf8")
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo2.close() # Cerramos el segundo archivo

print("se ha terminado el proceso de leer y copiar")

