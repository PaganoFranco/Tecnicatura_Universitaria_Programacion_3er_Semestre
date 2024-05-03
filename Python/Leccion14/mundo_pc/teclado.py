from mundo_pc.dispositivo_entrada import DispositivoEntrada


class Teclado(DispositivoEntrada):
    contador_teclados = 0

    def __init__(self, marca, tipo_entrada):
        Teclado.contador_teclados += 1
        self._id_teclado = Teclado.contador_teclados
        super().__init__(marca, tipo_entrada)

    # Método getter para el atributo marca
    def get_marca(self):
        return self._marca

    # Método setter para el atributo marca
    def set_marca(self, marca):
        self._marca = marca

    # Método getter para el atributo tipo_entrada
    def get_tipo_entrada(self):
        return self._tipo_entrada

    # Método setter para el atributo tipo_entrada
    def set_tipo_entrada(self, tipo_entrada):
        self._tipo_entrada = tipo_entrada

    def __str__(self):
        return f"Id: {self._id_teclado}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}"


# Prueba de la clase Teclado
if __name__ == "__main__":
    teclado1 = Teclado("HP", "USB")
    teclado2 = Teclado("Gamer", "Bluetooth")
    print(teclado1)
    print(teclado2)

    # Probando los métodos set y get
    teclado1.set_marca("HP")
    teclado1.set_tipo_entrada("USB-C")
    print("Marca de teclado1 después de cambio:", teclado1.get_marca())
    print("Tipo de entrada de teclado1 después de cambio:", teclado1.get_tipo_entrada())
