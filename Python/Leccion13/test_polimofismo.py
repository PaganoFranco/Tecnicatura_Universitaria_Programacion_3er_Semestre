from Empleado import Empleado


def imprimir_detalles(objeto):
    print(objeto)  # De manera indirecta llamamos al str de la clase empleado o gerente
    print(type(objeto))


empleado = Empleado("Franco", 700000.00)
imprimir_detalles(empleado)