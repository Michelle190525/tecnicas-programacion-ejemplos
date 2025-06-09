#Recarga de la tarjeta del bus en Cuenca.
class Recarga:
    def __init__(self, dinero):
        self.__dinero = dinero 

    def Recargar(self, cantidad):
        if cantidad > 0:
            self.__dinero += cantidad

    def obtener_dinero(self):
        return self.__dinero

Recarga = Recarga(100)
Recarga.Recargar(50)
print("Su Tarjeta De Bus Movilizate Cuenta Con Un Saldo De", Recarga.obtener_dinero())
 
