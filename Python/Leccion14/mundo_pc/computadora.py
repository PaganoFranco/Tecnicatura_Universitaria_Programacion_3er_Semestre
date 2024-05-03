from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado


class Computadora:
    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self._id_computadora = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    # Método getter para el atributo nombre
    def get_nombre(self):
        return self._nombre

    # Método setter para el atributo nombre
    def set_nombre(self, nombre):
        self._nombre = nombre

    # Método getter para el atributo monitor
    def get_monitor(self):
        return self._monitor

    # Método setter para el atributo monitor
    def set_monitor(self, monitor):
        self._monitor = monitor

    # Método getter para el atributo teclado
    def get_teclado(self):
        return self._teclado

    # Método setter para el atributo teclado
    def set_teclado(self, teclado):
        self._teclado = teclado

    # Método getter para el atributo raton
    def get_raton(self):
        return self._raton

    # Método setter para el atributo raton
    def set_raton(self, raton):
        self._raton = raton

    def __str__(self):
        return f'''
            {self._nombre}: {self._id_computadora}
            Monitor: {self._monitor}
            Teclado: {self._teclado}
            Raton: {self._raton}
        '''


if __name__ == "__main__":
    teclado1 = Teclado("HP", "USB")
    monitor1 = Monitor("HP", "15 Pulgadas")
    raton1 = Raton("HP", "USB")
    computadora1 = Computadora("HP", monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado("Acer", "Bluetooth")
    monitor2 = Monitor("Acer", "27 Pulgadas")
    raton2 = Raton("Acer", "Bluetooth")
    computadora2 = Computadora("HP", monitor2, teclado2, raton2)
    print(computadora2)
