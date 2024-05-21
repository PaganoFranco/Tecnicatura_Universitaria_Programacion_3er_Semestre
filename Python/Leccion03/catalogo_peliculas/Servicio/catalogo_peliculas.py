import os
class CatalogoPeliculas:
    """
        Esta clase define un catálogo para gestionar una lista de películas.

        Atributo de clase:
            ruta_archivo (str): Ruta del archivo de texto donde se almacenan las películas.

        Métodos de clase:
            agregar_peliculas(cls, pelicula):
                Agrega una nueva película al catálogo.

            listar_peliculas(cls):
                Muestra una lista de las películas almacenadas en el catálogo.

            eliminar_peliculas(cls):
                Elimina el archivo que contiene el catálogo de películas.
        """
    
    ruta_archivo = "peliculas.txt"

    @classmethod
    def agregar_peliculas(cls, pelicula):
        with open(cls.ruta_archivo, "a", encoding="utf8") as archivo:
            archivo.write(f"{pelicula.nombre}\n")

    @classmethod
    def listar_peliculas(cls):
        with open(cls.ruta_archivo, "r", encoding="utf8") as archivo:
            print(f" Catalogo de peliculas".center(50, "-"))
            print(archivo.read())

    @classmethod
    def eliminar_peliculas(cls):
        os.remove(cls.ruta_archivo)
        print(f"Archivo eliminado: {cls.ruta_archivo}")