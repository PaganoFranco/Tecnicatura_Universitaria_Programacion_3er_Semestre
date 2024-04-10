class Color:
    def __init__(self, color):
        self.color = color

    # Getter para obtener el valor del color
    @property
    def color(self):
        return self._color

    # Setter para modificar el valor del color
    @color.setter
    def color(self, color):
        self._color = color

    # Método ToString
    def __str__(self):
        return f"Color [color: {self._color}]"