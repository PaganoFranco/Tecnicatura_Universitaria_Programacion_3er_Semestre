class Persona:
    contador_personas = 0  # Variable de clase

    # Agregamos un metodo de clase
    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1  # Vamos inrementando
        return cls.contador_personas

    def __init__(self, nombre, edad):
        self.id_persona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad

    def __str__(self):
        return f'Persona [{self.id_persona} = {self.nombre} {self.edad}]'


persona1 = Persona('Franco', 27)
print(persona1)
persona2 = Persona("Juli", 27)
print(persona2)
persona3 = Persona("Juan Pablo", 27)
print(persona3)
Persona.generar_siguiente_valor()
persona4 = Persona("Agos", 25)
print(persona4)

print(f"Valor contador persona: {Persona.contador_personas}")