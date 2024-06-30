import psycopg2 as bd

conexion = bd.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
# Corrección de mensajes de error en Postgres
try:
       conexion.autocommit = False # esto directamente no deberia estar, incia la trancsaccion
       cursor = conexion.cursor()
       sentencia = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
       valores = ("Maria", "espanponotamos", "MaEspe@gmail.com")
       cursor.execute(sentencia, valores)

       sentencia = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
       valores = ("Juan", "Juares", "JJuares@gmail.com", 1)
       cursor.execute(sentencia, valores)

       conexion.commit() # Estamos haciendo el commit manualmente, se cierra la transaccion
       print("Termina la transaccion")
except Exception as e:
    conexion.rollback()
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()
