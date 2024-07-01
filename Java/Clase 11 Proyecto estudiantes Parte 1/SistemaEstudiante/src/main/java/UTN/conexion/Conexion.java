package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        // Variable para conectarnos a la base de datos
        var baseDatos = "estudaitnes2024";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "superAdmin";

        // Cargamos el driver de mysql en memoria
        try {
            Class.forName("con.mysqlo.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Ocurrio un error en la conexion: "+ e.getLocalizedMessage());
        }//Fin catch
        return conexion;
    }// Fin metodo Connection
}
