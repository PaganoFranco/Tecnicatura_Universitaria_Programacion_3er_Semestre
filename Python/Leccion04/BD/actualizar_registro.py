import psycopg2

conexion = psycopg2.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
try:
        with conexion:
            with conexion.cursor() as cursor:
                sentencia = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s"
                valores = ("Juan Carlos", "Zacas", "ZacasJuan@gmail.com", 4) # es una tupla
                cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia
                registros_actualizados = cursor.rowcount
                print(f"Los registros actualizados son: {registros_actualizados}")

except Exception as e:
        print(f"Ocurrio un error: {e}")
finally:
        conexion.close()