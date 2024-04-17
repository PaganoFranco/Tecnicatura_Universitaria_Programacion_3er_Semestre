from abc import ABC, abstractmethod
# ABC significa Abstrat Base Class, convirnte una clse en abstracta

class FiguraGeometrica(ABC):
    # Constructor de la clase FiguraGeometrica
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho  # Asigna el ancho proporcionado al atributo ancho
        else:
            self._ancho = 0
            print(f"Valor erroneo para el ancho: {ancho}")
        if self._validar_valores(alto):
            self._alto = alto    # Asigna el alto proporcionado al atributo alto
        else:
            self._alto = 0
            print(f"Valor erroneo para el alto: {alto}")

    # Getter para obtener el valor del ancho
    @property
    def ancho(self):
        return self._ancho

    # Setter para modificar el valor del ancho
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f"valor arroneo ancho: {ancho}")
    # Getter para obtener el valor del alto
    @property
    def alto(self):
        return self._alto

    # Setter para modificar el valor del alto
    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f"valor arroneo ancho: {alto}")

    @abstractmethod
    def calcular_area(self):
        pass

    # Método ToString
    def __str__(self):
        return f"FiguraGeometrica [Ancho: {self._ancho}, Alto: {self.alto}]"

    # Aplicacion de metodo encapsulado (se aplica de manera interta)
    def _validar_valores(self, valor):
        return True if 0 < valor < 10 else False