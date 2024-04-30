from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    # print(objeto)  # De manera indirecta llamamos al str de la clase empleado o gerente
    print(type(objeto)) # Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto,Gerente):
        print(objeto.departamento)


empleado = Empleado("Franco", 700000)
imprimir_detalles(empleado)

gerente = Gerente("Julieta", 500000, "Sistemas")
imprimir_detalles(gerente)