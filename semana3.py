#Programación Tradicional Semana 3
def obtener_temperaturas():
    temperaturas = []
    for i in range(7):
        temp = float(input(f"Ingrese la temperatura del día {i+1}: "))
        temperaturas.append(temp)
    return temperaturas

def calcular_promedio(temperaturas):
    return sum(temperaturas) / len(temperaturas)

# Ejecución
temperaturas = obtener_temperaturas()
promedio = calcular_promedio(temperaturas)
print(f"El promedio semanal de temperatura es: {promedio:.2f}°C")
