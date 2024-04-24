class MiClase:
    # Variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase = "Esta es una variable de clase"

    def __init__(self, variable_instancia):  # La variable de instacia, de diferentes valores
        self.variable_instancia = variable_instancia

    @staticmethod
    def metodo_estatico():  # Metodo estatico, se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):  # Metodo de clase
        print(cls.variable_clase)

    def metodo_instacia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

print(MiClase.variable_clase)
miClase1 = MiClase("Esta es una variable de instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase("Esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)

MiClase.variable_clase2 = "Valor de variable de clase 2"
print(MiClase.variable_clase2)
print(miClase1.variable_clase2)
print(miClase1.variable_clase2)

# llamar al metodo estatico
MiClase.metodo_estatico()

# llamamos al meotod de clase
MiClase.metodo_clase()

# Creamos otro objeto
miObjeto1 = MiClase("variable de intancia")
miObjeto1.metodo_clase()
miObjeto1.metodo_instacia()