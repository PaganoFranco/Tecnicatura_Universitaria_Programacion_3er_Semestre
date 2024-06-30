import psycopg2

conexion = psycopg2.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
try:
        with conexion:
            with conexion.cursor() as cursor:
                sentencia = "DELETE FROM persona WHERE id_persona=%s"
                entrada = input("Digite el numero de registro a eleminar: ")
                valores = (entrada, )
                cursor.execute(sentencia, valores) # De esta manera ejecutamos la sentencia
                registros_eliminados = cursor.rowcount
                print(f"Los eliminados actualizados son: {registros_eliminados}")

except Exception as e:
        print(f"Ocurrio un error: {e}")
finally:
        conexion.close()