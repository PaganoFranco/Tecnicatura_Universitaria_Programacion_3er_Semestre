import psycopg2

conexion = psycopg2.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
try:
        with conexion:
            with conexion.cursor() as cursor:
                sentencia = "INSERT INTO persona (nombre, apellido, email) VALUES (%s, %s, %s)"
                valores = ("Carlos", "Lopez", "LopezC@gmail.com") # es una tupla
                cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia
                # conexion.commit() esto se utilizar para guardar los cambios en la base de datos
                registros_insetados = cursor.rowcount
                print(f"Los registros insertados son: {registros_insetados}")


except Exception as e:
        print(f"Ocurrio un error: {e}")
finally:
        conexion.close()
