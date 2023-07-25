/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Security;

//Imported Library
import java.sql.*; 

//Database Conection
public class Database_Conection {
    private static final String URL = "jdbc:mysql://localhost:3306/Human_Resources_DB";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "Halobat17";
    private Connection conexion;

    public Database_Conection()
    {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}