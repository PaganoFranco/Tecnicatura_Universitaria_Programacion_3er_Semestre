import psycopg2

conexion = psycopg2.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
try:
        with conexion:
                with conexion.cursor() as cursor:
                        sentencia = "SELECT * FROM persona WHERE id_persona IN %s" # Placeholder
                        entrada = input("Digite los id_persona a buscar (separados con coma): ")
                        llaves_primarias = (tuple(entrada.split(", ")), )
                        cursor.execute(sentencia, llaves_primarias) # De esta manera ejecutamos la sentencia
                        registros = cursor.fetchall() # Recuperamos todos los registros que seran una lista
                        for registro in registros:
                            print(registro)
except Exception as e:
        print(f"Ocurrio un error: {e}")
finally:
        conexion.close()
