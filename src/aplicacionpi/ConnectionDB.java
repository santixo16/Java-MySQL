package aplicacionpi;

/**
 * Autores: Santiago Enrique Hernandez Contreras, Santiago Baquero Hurtado
 * Versión: 1.1
 * PROYECTO INTEGRADOR CUARTO SEMESTRE
 * FECHA: 28 de marzo de 2023
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    /**
    *The Connection object used to connect to the database.
    */
    private Connection conexion;
    /**
    *The name of the database to connect to.
    */
    private String database="";
    /**
    *The URL of the database to connect to.
    */
    private String url="jdbc:mysql://localhost:3306/" + database;
    /** 
    *The username used to authenticate the connection to the database.
    */
    private String user="root";
    /**
    *The password used to authenticate the connection to the database.
    */
    private String password="";

    /**
    *Constructor that sets the name of the database to connect to.
    *@param database the name of the database to connect to.
    */
    public ConnectionDB(String database) {
        
        this.database = database;
        
    }

    /**
    *Method that connects to the database using the provided credentials.
    *@return the Connection object used to connect to the database.
    *@throws SQLException if a database access error occurs.
    */
    public Connection conectar () {

        try {           
            conexion = DriverManager.getConnection(url + database, user, password);            
            System.out.println("Conexion EXITOSA a la base de datos: " + database);
        } catch (SQLException e) {            
            System.out.println("Conexion NO EXITOSA a la base de datos: " + database);
            e.printStackTrace();        
        }

        return conexion;
    }
    
    /**
    *Method that disconnects from the database.
    *@throws SQLException if a database access error occurs.
    */
    public void desconectar(){
        try {
            conexion.close();
            System.out.println("Desconexion EXITOSA de la base de datos: " + database);
        } catch (SQLException e) {
            System.out.println("Desconexion NO EXITOSA de la base de datos: " + database);
            e.printStackTrace();
        }
    }
    
}
