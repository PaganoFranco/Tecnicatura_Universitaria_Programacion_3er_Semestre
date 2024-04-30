from Producto import Producto


class Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Orden.contador_ordenes += 1
        self.id_orden = Orden.contador_ordenes
        self._productos = list(productos)

    # Creamos una funcion para agregar productos nuevos
    def agregar_producto(self, producto):
        self._productos.append(producto)

    def calcular_total(self):
        total = 0 # Creamos una variable de almacenamiento temporal

        for producto in self._productos: # Recorremos la lista y sumamos los precios
            total += producto.precio
        return total

    def __str__(self):
        producto_str = " "

        for producto in self._productos:
            producto_str += producto.__str__()+"|"
        return f"Orden: {self.id_orden}, \n Prductos: {producto_str}"


if __name__ == "__main__":
    producto1 = Producto("Camiseta", 100.00)
    producto2 = Producto("Pantalon", 150.00)
    productos1 = [producto1, producto2] # Creamos una lista
    orden1 = Orden(productos1)  # Primer objeto pasando la lista
    print(orden1)
    orden2 = Orden(productos1)
    print(orden2)

# TAREA:
# Modificar la orden2, ingresar nuevos productos con sus nombres y precios
# Crear una nueva lista de productos y agregarla a la orden2

# Creamos nuevos productos
producto3 = Producto("Remera", 125.00)
producto4 = Producto("Boxer", 50.00)
producto5 = Producto("Medias", 20.00)
producto6 = Producto("Musculosa", 250.00)

# Los agregamos a la lista de Orden 2 por medio de agregar_productos
# orden2.agregar_producto(producto3)
# print(orden2)

# orden2.agregar_producto(producto4)
# print(orden2)

# creamos una nueva lista
# productos2 = [producto5, producto6]
# orden3 = Orden(productos2)

# Le agregamos la orden3 a la orden2
# orden2.agregar_producto(orden3)
# print(orden2)