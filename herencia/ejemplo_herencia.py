class Animal:
    def hablar(self):
        print("El animal hace un sonido")

class Gato(Animal):
    def hablar(self):
        print("Miau miau")

p = Gato()
p.hablar()
