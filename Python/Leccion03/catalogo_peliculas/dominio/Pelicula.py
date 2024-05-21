class Pelicula:
    """
    Esta clase define un modelo para representar una película.

    Atributos:
        _nombre (str): Almacena el nombre de la película. Este atributo es privado y solo se puede acceder desde dentro de la clase mediante métodos.

    Métodos:
        __init__(self, nombre):
            Constructor de la clase. Inicializa el atributo '_nombre' con el valor proporcionado.

        __str__(self):
            Método de representación. Devuelve una cadena que representa la película, incluyendo su nombre.

        nombre:
            Decorador de propiedad para el atributo '_nombre'.
                getter: Permite obtener el valor del atributo '_nombre'.
                setter: Permite establecer el valor del atributo '_nombre'.
    """

    def __init__(self, nombre):
        """
        Constructor de la clase.

        Argumentos:
            nombre (str): El nombre de la película.
        """
        self._nombre = nombre  # Inicializa el atributo '_nombre' con el valor de 'nombre'.

    def __str__(self):
        """
        Método de representación.

        Devuelve:
            str: Una cadena que representa la película, incluyendo su nombre.
        """
        return f"Película: {self._nombre}"  # Crea una cadena con el formato "Película: [nombre de la película]".

    @property
    def nombre(self):
        """
        Decorador getter para el atributo '_nombre'.

        Devuelve:
            str: El nombre de la película.
        """
        return self._nombre  # Obtiene y devuelve el valor del atributo '_nombre'.

    @nombre.setter
    def nombre(self, nombre):
        """
        Decorador setter para el atributo '_nombre'.

        Argumentos:
            nombre (str): El nuevo nombre de la película.
        """
        self._nombre = nombre  # Establece el valor del atributo '_nombre' con el nuevo valor 'nombre'.

