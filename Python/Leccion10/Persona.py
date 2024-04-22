class Persona:
    contador_personas = 0  # Variable de clase

    def __init__(self, nombre, edad):
        Persona.contador_personas += 1  # vamos incrementando
        self.id_persona = Persona.contador_personas
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

print(f"Valor contador persona: {Persona.contador_personas}")