import psycopg2 as bd

conexion = bd.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
# Corrección de mensajes de error en Postgres
try:
       # conexion.autocommit = False # esto directamente no deberia estar
       cursor = conexion.cursor()
       sentencia = "INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)"
       valores = ("Maria", "Esperanza", "MaEspe@gmail.com")
       cursor.execute(sentencia, valores)
       conexion.commit() # Estamos haciendo el commit manualmente
       print("Termina la transaccion")
except Exception as e:
    conexion.rollback()
    print(f"Ocurrio un error: {e}")
finally:
    conexion.close()
