class FiguraGeometrica:
    # Constructor de la clase FiguraGeometrica
    def __init__(self, ancho, alto):
        self.ancho = ancho  # Asigna el ancho proporcionado al atributo ancho
        self.alto = alto    # Asigna el alto proporcionado al atributo alto

    # Getter para obtener el valor del ancho
    @property
    def ancho(self):
        return self._ancho

    # Setter para modificar el valor del ancho
    @ancho.setter
    def ancho(self, ancho):
        self._ancho = ancho

    # Getter para obtener el valor del alto
    @property
    def alto(self):
        return self._alto

    # Setter para modificar el valor del alto
    @alto.setter
    def alto(self, alto):
        self._alto = alto

    # Método ToString
    def __str__(self):
        return f"FiguraGeometrica [Ancho: {self._ancho}, Alto: {self.alto}]"
