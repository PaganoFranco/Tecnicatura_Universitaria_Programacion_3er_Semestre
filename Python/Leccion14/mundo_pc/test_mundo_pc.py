from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado("HP", "USB")
monitor1 = Monitor("HP", "15 Pulgadas")
raton1 = Raton("HP", "USB")
computadora1 = Computadora("HP", monitor1, teclado1, raton1)

teclado2 = Teclado("Acer", "Bluetooth")
monitor2 = Monitor("Acer", "27 Pulgadas")
raton2 = Raton("Acer", "Bluetooth")
computadora2 = Computadora("HP", monitor2, teclado2, raton2)

teclado3 = Teclado("LG", "Bluetooth")
monitor3 = Monitor("LG", "32 Pulgadas")
raton3 = Raton("LG", "USB")
computadora3 = Computadora("Samsung", monitor3, teclado3, raton3)

teclado4 = Teclado("Asus", "Bluetooth")
monitor4 = Monitor("Asus", "24 Pulgadas")
raton4 = Raton("Asus", "USB")
computadora4 = Computadora("Asus", monitor4, teclado4, raton4)

teclado5 = Teclado("Logitech", "USB")
monitor5 = Monitor("Logitech", "24 Pulgadas")
raton5 = Raton("Logitech", "Bluetooth")
computadora5 = Computadora("Logitech", monitor5, teclado5, raton5)

computadora6 = Computadora("Samsung", monitor1, teclado2, raton4)
computadora7 = Computadora("Gamer", monitor2, teclado3, raton5)

computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadoras(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora5, computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadoras(computadoras1)
print(orden2)