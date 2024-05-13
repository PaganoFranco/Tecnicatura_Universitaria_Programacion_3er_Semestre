try:
    10 / 0
# Mas generico
except Exception as e:
    print(f"Ocurrio un error: {e}")
# Mas espesifico
# except ZeroDivisionError as e:
# print(f"Ocurrio un error: {e}")