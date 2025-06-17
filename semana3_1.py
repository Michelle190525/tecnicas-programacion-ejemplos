class ClimaSemanal:
    def _init_(self):
        self.temperaturas = []

    def agregar_temperatura(self, temp):
        self.temperaturas.append(temp)

    def calcular_promedio(self):
        return sum(self.temperaturas) / len(self.temperaturas)

# Ejecución
clima = ClimaSemanal()
for i in range(7):
    temp = float(input(f"Ingrese la temperatura del día {i+1}: "))
    clima.agregar_temperatura(temp)

print(f"El promedio semanal de temperatura es: {clima.calcular_promedio():.2f}°C")