import psycopg2

conexion = psycopg2.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
try:
        with conexion:
                with conexion.cursor() as cursor:
                        sentencia = "SELECT * FROM persona"
                        cursor.execute(sentencia) # De esta manera ejecutamos la sentencia
                        registro = cursor.fetchall() # Recuperamos todos los registros que seran una lista
                        print(registro)
except Exception as e:
        print(f"Ocurrio un error: {e}")
finally:
        conexion.close()
