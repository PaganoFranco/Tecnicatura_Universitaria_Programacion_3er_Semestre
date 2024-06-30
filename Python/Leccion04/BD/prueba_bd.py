import psycopg2

conexion = psycopg2.connect(user='postgres', password='SuperAdmin', host='localhost', port='5432', database='test')
# Corrección de mensajes de error en Postgres
try:
        with conexion:
                with conexion.cursor() as cursor:
                        sentencia = "SELECT * FROM persona WHERE id_persona = %s" # Placeholder
                        id_persona = input("Digite un numero para el id_persona: ")
                        cursor.execute(sentencia, (id_persona, )) # De esta manera ejecutamos la sentencia
                        registro = cursor.fetchone()
                        # registro = cursor.fetchall() Recuperamos todos los registros que seran una lista
                        print(registro)
except Exception as e:
        print(f"Ocurrio un error: {e}")
finally:
        conexion.close()

# https://www.psycopg.org/docs/usage.html
