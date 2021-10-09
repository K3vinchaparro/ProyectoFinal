package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection connection = null;
    String url = "jdbc:postgresql://localhost:5432/OlimpiadasPF_g5";  

    String usuario = "postgres";
    String contrasena = "root";
    
    public Connection conectar(){
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, usuario, contrasena);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar " + e);
        }
    return connection;
    }
    
}
