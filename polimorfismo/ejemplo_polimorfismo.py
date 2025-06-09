class Persona:
    def trabajar(self):
        print("Trabajando...")

class Profesor(Persona):
    def trabajar(self):
        print("Enseñando...")

class Ingeniero(Persona):
    def trabajar(self):
        print("Diseñando...")

def mostrar_trabajo(persona):
    persona.trabajar()

mostrar_trabajo(Profesor())
mostrar_trabajo(Ingeniero())
