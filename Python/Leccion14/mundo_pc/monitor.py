class Monitor:
    contador_monitores = 0

    def __init__(self, marca, tamaño):
        Monitor.contador_monitores += 1
        self._id_monitor = Monitor.contador_monitores
        self._marca = marca
        self._tamaño = tamaño

    # Método getter para el atributo marca
    def get_marca(self):
        return self._marca

    # Método setter para el atributo marca
    def set_marca(self, marca):
        self._marca = marca

    # Método getter para el atributo tamaño
    def get_tamaño(self):
        return self._tamaño

    # Método setter para el atributo tamaño
    def set_tamaño(self, tamaño):
        self._tamaño = tamaño

    def __str__(self):
        return f"Id: {self._id_monitor}, Marca: {self._marca}, Tamaño: {self._tamaño}"


# Hacemos una prueba de testeo
if __name__ == "__main__":
    monitor1 = Monitor("HP", "15 Pulgadas")
    monitor2 = Monitor("Acer", "27 Pulgadas")
    print(monitor1)
    print(monitor2)

    # Probando los métodos set y get
    monitor1.set_marca("Dell")
    monitor1.set_tamaño("20 Pulgadas")
    print("Marca de monitor1 después de cambio:", monitor1.get_marca())
    print("Tamaño de monitor1 después de cambio:", monitor1.get_tamaño())
