import psycopg2 as bd

conexion = bd.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
# Corrección de mensajes de error en Postgres
try:
    with conexion:
        with conexion.cursor() as cursor:
           sentencia = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
           valores = ("Paloma", "Quiroga", "Palo@gmail.com")
           cursor.execute(sentencia, valores)

           sentencia = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
           valores = ("Juan Ariel", "Perez", "JAPerez@gmail.com", 1)
           cursor.execute(sentencia, valores)

except Exception as e:
    conexion.rollback()
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()

print("Termina la transaccion")
